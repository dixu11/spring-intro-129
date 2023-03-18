package com.sda.springdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//decyduje kiedy zrobi odczyt zapis oraz inne operacje
@Component
public class Application{

    //private final FileRepository fileRepository = new FileRepository();

    //niezalecany sposob wstrzykiwania zależności przez pole
    //@Autowired
    private Repository repository;

    // zalecany sposob wtrzykiwania zależności przez konstruktor
    // w przypadku jednego konstruktora nie potrzeba adnotacji AUTOWIRED
    @Autowired
    public Application(@Qualifier("File") Repository repository) {
      //  System.out.println("Utworzenie application");
       // System.out.println(repository);
        this.repository = repository;
    }

    public Application() {
        repository = null;
        System.out.println("Utworzenie application bez repository");
    }

   // @PostConstruct
    public void start() {
        System.out.println("Start programu");
        repository.read();
        end();
    }

    public void end() {
        System.out.println("Koniec programu");
        repository.write();
    }

    //niezalecany sposob wstrzykiwania zależności przez setter
    //@Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
