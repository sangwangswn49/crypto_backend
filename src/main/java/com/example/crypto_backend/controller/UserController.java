package com.example.crypto_backend.controller;

import com.example.crypto_backend.model.User;
import com.example.crypto_backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping("/getUsers")
    public List<User> getUser() {
        return userRepo.findAll();
    }

    @GetMapping("/getUserById")
    public User getUserById(@RequestParam int id) {
        return userRepo.findById(id).get();
    }

    @DeleteMapping("/deleteUserById")
    public void deleteUserById(@RequestParam int id) {
        userRepo.deleteById(id);
    }
}
