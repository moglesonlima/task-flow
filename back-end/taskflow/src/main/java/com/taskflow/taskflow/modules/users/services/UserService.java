package com.taskflow.taskflow.modules.users.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.taskflow.taskflow.modules.users.model.UserEntity;
import com.taskflow.taskflow.modules.users.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    public UserEntity createUser(UserEntity userEntity) {

        // if (userRepository.findByEmail(userEntity.getEmail()) != null) {
        //     throw new RuntimeException("Email already exists");

        // }else if (userRepository.findByName(userEntity.getName()) != null) {
        //     throw new RuntimeException("Name already exists");
        // }

        var user = userRepository.save(userEntity);
        return user;
        
    }

    public Optional<UserEntity> getUserById(UUID id) {
        return userRepository.findById(id);
    }

    public Optional<UserEntity> editUser(UserEntity userEntity) {
        var user = userRepository.findById(userEntity.getId());

        if (user.isEmpty()) {
            return user;            
        }

        return  null;
    }

}
