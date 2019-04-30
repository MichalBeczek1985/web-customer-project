package com.majkel.springdemo.service;

import java.util.List;

import com.majkel.springdemo.entity.Customer;

public interface CustomerService {

	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
