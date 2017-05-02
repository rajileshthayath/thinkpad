package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping("/greeting")
	public SomeClass greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new SomeClass(name);
	}
	
	@RequestMapping("/register")
	public Registration register(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age,
			@RequestParam(value = "email") String email, @RequestParam(value = "address")String address) {
		return new Registration(name, email, address, age);
	}
}
