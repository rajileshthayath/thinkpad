package com.example;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class Registration {

	@Override
	public String toString() {
		return "Registration [name=" + name + ", email=" + email + ", address=" + address + ", age=" + age + "]";
	}

	@NotEmpty(message = "Name cannot be Empty")
	private String name;

	@NotEmpty(message = "Name cannot be Empty")
	private String email;

	@NotEmpty(message = "Name cannot be Empty")
	private String address;

	private int age;

	public Registration() {
	}

	public Registration(String name, String email, String address, int age) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
