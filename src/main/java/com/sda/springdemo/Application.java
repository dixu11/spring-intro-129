package com.sda.springdemo;

//decyduje kiedy zrobi odczyt zapis oraz inne operacje
public class Application{

//    private final FileRepository fileRepository = new FileRepository();
    private final Repository repository;

    public Application(Repository repository) {
        this.repository = repository;
    }

    public void start() {
        System.out.println("Start programu");
        repository.read();
    }

    public void end() {
        System.out.println("Koniec programu");
        repository.write();
    }
}
