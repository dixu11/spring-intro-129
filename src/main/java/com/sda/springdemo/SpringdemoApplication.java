package com.sda.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//z jakich elementów składamy aplikację
//@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringdemoApplication.class, args);
        DBRepository dbRepository = new DBRepository();
        Application application = new Application(dbRepository);
        Application application2 = new Application(dbRepository);


        application.start();
        application.end();

    }
}
