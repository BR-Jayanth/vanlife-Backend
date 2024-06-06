package com.example.vanlife_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin
public class VansController {

    @Autowired
    private VansService vansService;

    @GetMapping("/api/v1/test")
    public String test(){
        return "application running";
    }
    @GetMapping("/api/v1/vans")
    public ResponseEntity<VansModal> GetVans(){
        List<VansModal> data = vansService.getVans();

        if(data==null){
            return ResponseEntity.notFound().build();
        } else {
            return  new ResponseEntity(data, HttpStatus.OK);
        }

    }
    @GetMapping("/api/v1/van/{id}")
    public ResponseEntity<List<Optional<VansModal>>> GetVan(@PathVariable String id){
        List<Optional<VansModal>>data = vansService.getVan(id);
        if(data==null){
            return ResponseEntity.notFound().build();
        } else {
            return  new ResponseEntity(data, HttpStatus.OK);
        }

    }
    @PostMapping("/api/v1/hostvans")
    public ResponseEntity<Optional<VansModal>> GetHostVans(@RequestBody Map<String ,String> payload){
        List<Optional<VansModal>> data = vansService.getHostVans(payload.get("hostId"));
        if(data==null||data.isEmpty()){
            return ResponseEntity.notFound().build();
        } else {
            return  new ResponseEntity(data, HttpStatus.OK);
        }

    }
}
