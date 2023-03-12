package com.sda.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringdemoApplication.class, args);

	Application application = new Application();

	application.start();
	application.end();

	}
}
