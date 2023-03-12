package com.sda.springdemo;
//jak zrobić odczyt/ zapis w pliku
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
