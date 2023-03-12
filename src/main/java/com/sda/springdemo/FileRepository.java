package com.sda.springdemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//jak zrobić odczyt/ zapis w pliku
@Component("File")
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
