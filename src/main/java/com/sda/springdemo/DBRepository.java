package com.sda.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//jak zrobić zapis odczyt w bazie
@Primary
@Component("DB")
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
