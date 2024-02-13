package com.taskflow.taskflow.modules.users.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskflow.taskflow.modules.users.dto.UserDto;
import com.taskflow.taskflow.modules.users.model.UserEntity;
import com.taskflow.taskflow.modules.users.services.UserService;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api/v1/users")
public class UserController { 
    
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserDto user) {  
        var userEntity = new UserEntity();
        userEntity.setName(user.getName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        
        var userSaved = userService.createUser(userEntity);      
        
        return ResponseEntity.status(201).body(userSaved);   
    }

    @GetMapping
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.status(200).body(userService.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable UUID id) {       
        var user = userService.getUserById(id);
        
        if (user.isEmpty()) {
            return ResponseEntity.status(404).body("User not found");
        }

        return ResponseEntity.status(200).body(user);
    }
    
    

}
