package com.sda.springdemo.miniproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductParsingService {

    private ProductRepository csvRepo;
    private ProductRepository jsonRepo;

    public ProductParsingService(@Qualifier("toCsv") ProductRepository csvRepo,
                                 @Qualifier("toJson") ProductRepository jsonRepo) {
        this.csvRepo = csvRepo;
        this.jsonRepo = jsonRepo;
    }

    public void convertFile(ConversionType conversionType) {
        List<Product> products;
        switch (conversionType) {
            case CSV_TO_JSON:
                products = csvRepo.readAll();
                jsonRepo.saveAll(products);
                break;
            case JSON_TO_CSV:
                products = jsonRepo.readAll();
                csvRepo.saveAll(products);
                break;
            default:
                throw new IllegalStateException("Nie rozpoznany rodzaj konwersji");
        }
    }


}
