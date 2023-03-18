package com.sda.springdemo.miniproject;

import java.util.List;

public interface ProductRepository {

    List<Product> readAll();

    void saveAll(List<Product> products);

}
