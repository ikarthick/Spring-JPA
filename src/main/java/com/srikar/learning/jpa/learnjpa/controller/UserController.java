package com.srikar.learning.jpa.learnjpa.controller;

import com.srikar.learning.jpa.learnjpa.entity.User;
import com.srikar.learning.jpa.learnjpa.service.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAOService userDAOService;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        return userDAOService.createUser(user);
    }

    @PostMapping("/addusers")
    public List<User> addUsers(@RequestBody List<User> users){
        return userDAOService.createUsers(users);
    }

    @PutMapping("/updateuser")
    public User updateUser(@RequestBody User user){
        return userDAOService.updateUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUserbyId(@PathVariable Integer id){
        return userDAOService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userDAOService.getUsers();
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userDAOService.deleteUserById(id);
    }

}
