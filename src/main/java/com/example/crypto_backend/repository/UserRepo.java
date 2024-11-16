package com.example.crypto_backend.repository;

import com.example.crypto_backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, Integer> {
}
