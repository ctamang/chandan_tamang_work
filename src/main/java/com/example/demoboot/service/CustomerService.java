package com.example.demoboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoboot.entity.Customer;
import com.example.demoboot.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public Customer getCustomer(Integer id) {
		Customer theCustomer = customerRepository.findById(id).get();
		return theCustomer;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> findAll = customerRepository.findAll();
		return findAll;
	}

	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(Integer id) {
		customerRepository.deleteById(id);
	}
}
