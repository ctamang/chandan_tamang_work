package com.example.demoboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoboot.entity.Customer;
import com.example.demoboot.service.CustomerService;

@Controller
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired	
	CustomerService customerService;
	
	@PostMapping("/")
	public void addUser(@RequestBody Customer customer ) {
		customerService.addCustomer(customer);
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return customerService.getCustomer(id);
	}
	
	@GetMapping("/all")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@PutMapping("/")
	public void updateCustomer(@RequestBody Customer customer){
		customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		customerService.deleteCustomer(id);
	}
}
