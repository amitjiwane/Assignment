package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();
	
	public Customer saveCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public String deleteCustomer(Customer customer);
}
