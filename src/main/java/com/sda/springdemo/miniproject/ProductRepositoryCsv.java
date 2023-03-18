package com.sda.springdemo.miniproject;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component("toCsv")
public class ProductRepositoryCsv implements ProductRepository {

    private Scanner scanner;
    private BufferedWriter writer;

    public ProductRepositoryCsv() {
        try {
            File source = new File("products.csv");
            scanner = new Scanner(source);
            writer = new BufferedWriter(new FileWriter(source, true));
        } catch (IOException e) {
            throw new ProductRepositoryException("Nie udało się zaczytać z pliku products.csv");
        }
    }

    @Override
    public List<Product> readAll() {
        List<Product> products = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lineElements = line.split(";");
            String name = lineElements[0];
            double price = Double.parseDouble(lineElements[1]);
            int quantity = Integer.parseInt(lineElements[2]);
            Product product = new Product(name, quantity, price);
            products.add(product);
        }
        return products;
    }

    @Override
    public void saveAll(List<Product> products) {
        try {
            for (Product product : products) {
                writer.write(String.format("%s;%.2f;%d\n",
                        product.getName(), product.getPrice(), product.getQuantity()));
            }
            writer.close();
        } catch (IOException e) {
            throw new ProductRepositoryException("Nie udało się zapisać produktów: ");
        }

    }
}
