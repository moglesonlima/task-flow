package com.taskflow.taskflow.modules.tasks.model;

import java.util.UUID;

import org.hibernate.annotations.ManyToAny;

import com.taskflow.taskflow.modules.users.model.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tasks")
public class TaskEntyti {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)    
    private UUID id;
    private String name;
    private String description;
    private String status = "PENDING";
    private String priority;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    // private String deadline;
    // private String createdAt;
    // private String updatedAt;
    // private String deletedAt;

    
}
