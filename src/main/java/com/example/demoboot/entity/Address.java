package com.example.demoboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private Integer addressId;
	 
	private String addressLine1;
	
	private String addressLine2;
	
	private String landMark;
	
	private String city;
		
	private String state;
	
	@ManyToOne
	private Customer customer;
	
	public Address() {
		
	}
	
	public Address(String addressLine1, String addressLine2, String landMark, String city, String state) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.landMark = landMark;
		this.city = city;
		this.state = state;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
