package com.example.demoboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoboot.entity.Customer;

@RestController
public class TestController {

	@GetMapping("/test")
	public Customer getUer() {
		return new Customer("Chandan", "tamang", "9987705678", "chandan@gmail.com");
	}
}
