package com.sda.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerConfiguration {

    @Bean
    public Scanner createScanner() {
        return new Scanner(System.in);
    }
}
