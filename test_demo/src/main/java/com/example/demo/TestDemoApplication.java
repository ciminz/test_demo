package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDemoApplication {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		SpringApplication.run(TestDemoApplication.class, args);
	}

}
