package com.sda.springdemo.miniproject;

import org.springframework.stereotype.Component;

@Component
public class ProductRepositoryCsv implements ProductRepository{

    public ProductRepositoryCsv() {
        System.out.println("CSV");
    }
}
