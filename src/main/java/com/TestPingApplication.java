package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://localhost:8080/api/ping
@SpringBootApplication

public class TestPingApplication {

	public static void main(String[] args) {
		System.out.println("TestPingApplication.......");
		SpringApplication.run(TestPingApplication.class, args);
	}

}
