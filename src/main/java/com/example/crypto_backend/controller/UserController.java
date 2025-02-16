package com.example.crypto_backend.controller;

import com.example.crypto_backend.model.User;
import com.example.crypto_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getUsers")
    public List<User> getUser() {
        return userService.getUser();
    }

    @GetMapping("/getUserById")
    public User getUserById(@RequestParam int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/deleteUserById")
    public void deleteUserById(@RequestParam int id) {
        userService.deleteUserById(id);
    }
}
