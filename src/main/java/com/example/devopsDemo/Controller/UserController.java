package com.example.devopsDemo.Controller;

import com.example.devopsDemo.Entity.User;
import com.example.devopsDemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping()
    public User addUser(@RequestBody User user){
        user.setUserId(0);
        return userService.saveUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }

    @PutMapping()
    public User updateUSer(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public Optional<User> findUser(@PathVariable  int userId){
        return userService.findUser(userId);
    }

}
