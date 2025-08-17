package com.nec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

	@GetMapping
	public String sayHello() {
		return "Hello Sir, hi good morning";
	}
}
