package com.sda.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerConfiguration {

    @Bean
    public Scanner createScanner(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }


}
