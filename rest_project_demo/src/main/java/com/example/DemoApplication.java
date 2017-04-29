package com.example;

import javax.ws.rs.POST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@POST
	@RequestMapping("/greeting")
	public SomeClass greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new SomeClass(name);
	}
	
	@POST
	@RequestMapping("/register")
	public Registration register(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "age",defaultValue = "0", required = false) int age,
			@RequestParam(value = "email", required = false) String email, @RequestParam(value = "address", required = false) String address) {
		return new Registration(name, email, address, age);
	}
}
