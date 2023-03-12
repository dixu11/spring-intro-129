package com.sda.springdemo;

public class Application {

    private final FileRepository fileRepository = new FileRepository();

    public void start() {
        System.out.println("Start programu");
        fileRepository.read();
    }

    public void end() {
        System.out.println("Koniec programu");
        fileRepository.write();
    }
}
