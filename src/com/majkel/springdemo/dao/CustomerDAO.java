package com.majkel.springdemo.dao;

import java.util.List;

import com.majkel.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);	
}
	