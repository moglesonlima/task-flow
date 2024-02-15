package com.taskflow.taskflow.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskflow.taskflow.dto.UserDto;
import com.taskflow.taskflow.model.User;
import com.taskflow.taskflow.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/users")
public class UserController {

     @Autowired
     private UserService userService;

     @GetMapping
    public List<User> getAllUsers() {
         return userService.getAllUsers();
     }

     @PostMapping
     public User postMethodName(@RequestBody UserDto userDTO) {      
        return userService.saveUser(userDTO);
     }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable UUID id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putMethodName(@PathVariable UUID id, @RequestBody UserDto userDto) {

        return userService.updateUser(id, userDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable UUID id) {
        return userService.deleteUserById(id);
    }

    
}
