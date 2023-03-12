package com.sda.springdemo;

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
