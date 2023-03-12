package com.sda.springdemo;

public class FileRepository implements Repository{

    @Override
    public void read(){
        System.out.println("Read from file");
    }

    @Override
    public void write(){
        System.out.println("Write into file");
    }
}
