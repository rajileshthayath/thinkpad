package com.example.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Registration;

@RestController
public class RegistrationController {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public <T> Registration register(@RequestBody @Valid Registration registration) {
		System.err.println(registration);
		return registration;
	}
}