package com.java.dsa.springboot.repository;

import com.java.dsa.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}