package com.taskflow.taskflow.modules.users.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.taskflow.taskflow.modules.users.model.UserEntity;

public interface UserRepository extends JpaRepositoryImplementation<UserEntity, UUID> {
   public UserEntity findByEmail(String email);
   public UserEntity findByName(String name);

}
