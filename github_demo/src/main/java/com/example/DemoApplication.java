package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class GithubDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubDemoApplication.class, args);
	}
	
	@RequestMapping("/test")
	public Object someMappings() {
		return new Object();
	}
}
