package com.sda.springdemo.miniproject;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductParsingController {

  private   ProductParsingService service;

    public ProductParsingController(ProductParsingService service) {
        this.service = service;
    }

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

        ConversionType conversionType;
        switch (input){
            case "csv":
                conversionType = ConversionType.JSON_TO_CSV;
                break;
            case "json":
                conversionType = ConversionType.CSV_TO_JSON;
                break;
            default:
                System.out.println("Błąd! Podaj 'csv' lub 'json'");
                executeMenu();
                return;
        }
        service.convertFile(conversionType);
    }


}
