package com.example.crypto_backend.service;

import com.example.crypto_backend.model.Order;
import com.example.crypto_backend.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;

    public Order addOrder(Order Order) {
        return orderRepo.save(Order);
    }

    public List<Order> getOrder() {
        return orderRepo.findAll();
    }

    public Order getOrderById(int id) {
        return orderRepo.findById(id).get();
    }

    public void deleteOrderById(int id) {
        orderRepo.deleteById(id);
    }
}
