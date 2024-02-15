package com.taskflow.taskflow.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskflow.taskflow.model.User;
import java.util.UUID;


@Repository
public interface UserRepository extends JpaRepository<User, UUID>{
    
}
