package com.sda.springdemo.miniproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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

    }


}
