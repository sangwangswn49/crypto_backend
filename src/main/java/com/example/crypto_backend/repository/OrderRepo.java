package com.example.crypto_backend.repository;

import com.example.crypto_backend.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order, Integer> {
}
