package com.taskflow.taskflow.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.taskflow.taskflow.dto.UserDto;
import com.taskflow.taskflow.model.User;
import com.taskflow.taskflow.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

   public List<User> getAllUsers() {
    
       return userRepository.findAll();
   }

    public User saveUser(UserDto userDto) {

        System.out.println(userDto.toString());

         User user = new User();
         user.setUserName(userDto.getName());
         user.setPassword(userDto.getPassword());
         user.setEmail(userDto.getEmail());
         return userRepository.save(user);
    }

    public ResponseEntity<?> getUserById(UUID id) {
        var userFind = userRepository.findById(id);
        // userFind.ifPresent(user -> System.out.println(user.toString()));

        if(userFind.isPresent()) {
            UserDto userDto = new UserDto();
            

            userDto.setName(userFind.get().getUserName());
            userDto.setEmail(userFind.get().getEmail());
            userDto.setPassword(userFind.get().getPassword());

            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();            
    }

    
    public ResponseEntity<?> updateUser(UUID id, UserDto userDto) {
        var user = userRepository.findById(id);

        if(user.isPresent()) {

            var userToUpdate = user.get();
            userToUpdate.setUserName(userDto.getName());
            userToUpdate.setEmail(userDto.getEmail());
            userToUpdate.setPassword(userDto.getPassword());
            
            return ResponseEntity.ok(userRepository.save(userToUpdate));
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<?> deleteUserById(UUID id) {
        var user = userRepository.findById(id);

        if(user.isPresent()) {
            userRepository.deleteById(id);
            return ResponseEntity.ok().body("User deleted successfully!");
        }
        return ResponseEntity.status(404).body("User not found!");
    }
}
