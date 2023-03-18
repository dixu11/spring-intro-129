package com.sda.springdemo.miniproject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component("toJson")
public class ProductRepositoryJson implements ProductRepository {
    private ObjectMapper objectMapper;

    public ProductRepositoryJson() {
        objectMapper = new ObjectMapper();
    }

    @Override
    public List<Product> readAll() {
        try {
            List products = objectMapper.readValue(new File("products.json"), List.class);
            return new ArrayList<>(products);
        } catch (IOException e) {
            throw new ProductRepositoryException("Problem z odczytem z products.json");
        }
    }

    @Override
    public void saveAll(List<Product> products) {
        try {
            objectMapper.writeValue(new File("products.json"),products);
        } catch (IOException e) {
            throw new ProductRepositoryException("Problem z zapisem z products.json");
        }
    }
}
