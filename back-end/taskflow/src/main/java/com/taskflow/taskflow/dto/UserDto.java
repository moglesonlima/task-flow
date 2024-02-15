package com.taskflow.taskflow.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class UserDto {
    //private UUID id;
    private String name;
    private String password;
    private String email;
    // private String role;  
    
}
