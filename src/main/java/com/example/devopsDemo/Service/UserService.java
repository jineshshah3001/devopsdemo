package com.example.devopsDemo.Service;

import com.example.devopsDemo.Entity.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public List<User> findAll();

    public User saveUser(User user);

    public void deleteUser(int userId);

    public Optional<User> findUser(int userId);
}
