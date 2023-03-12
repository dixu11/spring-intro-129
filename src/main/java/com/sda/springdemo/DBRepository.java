package com.sda.springdemo;

//jak zrobić zapis odczyt w bazie
public class DBRepository implements Repository{
    @Override
    public void read(){
        System.out.println("Read from DB");
    }

    @Override
    public void write(){
        System.out.println("Write into DB");
    }
}
