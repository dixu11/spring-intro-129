package com.sda.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class RepositoryTester {

    private final Repository repository;

    public RepositoryTester(@Qualifier("File") Repository repository){
       // System.out.println("Utworzenie repositoryTestera");
      //  System.out.println(repository);
        this.repository = repository;
    }

    public void test(){
        System.out.println("Sprawdzam, czy repository dziala");
        repository.write();
        repository.read();
    }
}
