package com.sda.springdemo;

import org.springframework.stereotype.Component;

//jak zrobić zapis odczyt w bazie
@Component
public class DBRepository implements Repository{

    public DBRepository() {
        System.out.println("DBRepository");
    }

    @Override
    public void read(){
        System.out.println("Read from DB");
    }

    @Override
    public void write(){
        System.out.println("Write into DB");
    }
}
