package com.sda.springdemo;

public class Application{

//    private final FileRepository fileRepository = new FileRepository();
    private final Repository repository = new FileRepository();

    public void start() {
        System.out.println("Start programu");
        repository.read();
    }

    public void end() {
        System.out.println("Koniec programu");
        repository.write();
    }
}
