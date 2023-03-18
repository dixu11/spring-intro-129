package com.sda.springdemo.miniproject;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductParsingController {


    @PostConstruct
    public void executeMenu() {
        System.out.println("""
                Co chcesz panie zrobić?
                Z json na csv -> napisz 'csv'
                Z csv na json -> napisz 'json'
                """
        );

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Wybrałeś: ");
        System.out.println(input);
    }


}
