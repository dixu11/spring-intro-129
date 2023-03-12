package com.sda.springdemo;

import org.springframework.stereotype.Component;

//jak zrobić odczyt/ zapis w pliku
@Component
public class FileRepository implements Repository{

    public FileRepository() {
        System.out.println("Utworzenie FileRepository");
    }

    @Override
    public void read(){
        System.out.println("Read from file");
    }

    @Override
    public void write(){
        System.out.println("Write into file");
    }
}
