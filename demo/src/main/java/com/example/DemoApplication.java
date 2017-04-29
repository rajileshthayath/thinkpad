package com.example;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/greeting")
	public SomeClass greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new SomeClass(name);
	}

	@JsonInclude(value = Include.NON_NULL)
	public class SomeClass {
		private String name;
		private Long currentDate = new Date().getTime();

		public SomeClass() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getCurrentDate() {
			return currentDate;
		}

		public void setCurrentDate(Long currentDate) {
			this.currentDate = currentDate;
		}

		public SomeClass(String name) {
			this.name = name;
		}
	}

}