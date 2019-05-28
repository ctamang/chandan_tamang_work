package com.example.demoboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customerId;
	
	private String firstName;
	
	private String lastName;

	private String contactNumber;
	
	private String email;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
	@JsonIgnore
	private List<Address> addressList;

	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, String contactNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	public Integer getUserId() {
		return customerId;
	}

	public void setUserId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addAddress(Address address) {
		if(addressList.isEmpty()) {
			addressList = new ArrayList<>();
		}
		addressList.add(address);
	}
	
	public List<Address> getAddressList() {
		return addressList;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "User [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNumber="
				+ contactNumber + ", email=" + email + "]";
	}
	
}
