package com.controler;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@GetMapping("/ping")
	public String getMessage() {
		System.out.println("Welcome to new Spring boot code pipeline Appdeployed on AWS Env on date" + new Date());
		return "Welcome to new Spring boot code pipeline Appdeployed on AWS Env on date-" + new Date();
	}

}
