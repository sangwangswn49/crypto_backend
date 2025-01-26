package com.example.crypto_backend.controller;

import com.example.crypto_backend.model.Order;
import com.example.crypto_backend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/addOrder")
    public Order addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @GetMapping("/getOrders")
    public List<Order> getOrder() {
        return orderService.getOrder();
    }

    @GetMapping("/getOrderById")
    public Order getOrderById(@RequestParam int id) {
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/deleteOrderById")
    public void deleteOrderById(@RequestParam int id) {
        orderService.deleteOrderById(id);
    }
}
