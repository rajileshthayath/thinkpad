package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SomeClass;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
	public SomeClass greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new SomeClass(name);
	}
}
