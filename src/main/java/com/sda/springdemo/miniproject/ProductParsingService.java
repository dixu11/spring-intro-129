package com.sda.springdemo.miniproject;

import org.springframework.stereotype.Component;

@Component
public class ProductParsingService {

    public void convertFile(ConversionType conversionType) {
        System.out.println("Wykonam konwersję typu:");
        System.out.println(conversionType);
    }


}
