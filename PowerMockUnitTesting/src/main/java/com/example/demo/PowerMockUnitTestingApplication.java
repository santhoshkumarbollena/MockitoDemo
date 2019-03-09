package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PowerMockUnitTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerMockUnitTestingApplication.class, args);
		MockitoExample ex=new MockitoExample();
		ex.test();
		
	}

}
