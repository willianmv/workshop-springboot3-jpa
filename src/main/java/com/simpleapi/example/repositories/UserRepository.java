package com.simpleapi.example.repositories;

import com.simpleapi.example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
