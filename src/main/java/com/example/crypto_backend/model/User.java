package com.example.crypto_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;
    private String username;
    private String password;
    private String name;
    private List<String> list;
    private List<Asset> wallet;
    private List<Order> orders;
}
