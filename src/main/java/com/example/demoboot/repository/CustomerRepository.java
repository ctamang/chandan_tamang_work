package com.example.demoboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoboot.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
