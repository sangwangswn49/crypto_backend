package com.example.crypto_backend.service;

import com.example.crypto_backend.model.User;
import com.example.crypto_backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> getUser() {
        return userRepo.findAll();
    }

    public User getUserById(int id) {
        return userRepo.findById(id).get();
    }

    public void deleteUserById(int id) {
        userRepo.deleteById(id);
    }
}
