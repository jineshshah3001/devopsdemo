package com.example.devopsDemo.Dao;

import com.example.devopsDemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
