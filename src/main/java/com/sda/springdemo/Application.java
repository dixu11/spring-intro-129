package com.sda.springdemo;

public class Application {

//    private final FileRepository fileRepository = new FileRepository();
    private final DBRepository dbRepository = new DBRepository();

    public void start() {
        System.out.println("Start programu");
        dbRepository.readFromDB();
    }

    public void end() {
        System.out.println("Koniec programu");
        dbRepository.writeToDB();
    }
}
