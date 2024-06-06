package com.example.vanlife_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/user/test")
    public String getUserTest() {
        return "app running";
    }

    @GetMapping("/api/users")
    public ResponseEntity<UserModal> GetUsers() {
        return new ResponseEntity(userService.getUsers(), HttpStatus.OK);
    }

    @PostMapping("/api/user")
    public ResponseEntity<UserModal> GetUser(@RequestBody Map<String ,String> payload) {
        Optional<UserModal> data=userService.getUser(payload.get("email"),payload.get("password"));
        if(data==null){
            return ResponseEntity.notFound().build();
        } else {
            return  new ResponseEntity(data, HttpStatus.OK);
        }

    }
}
