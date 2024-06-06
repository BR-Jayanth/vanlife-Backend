package com.example.vanlife_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;


    public List<UserModal> getUsers() {
        List<UserModal> data = userRepository.findAll();

        return data;
    }

    public Optional<UserModal> getUser(String email , String password){
       // to check user credential
        Optional<UserModal> data= userRepository.findByEmail(email);

        if(data.get().getPassword().equals(password)){
            return data;
        }else{
            return null;
        }

    }
}
