package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.serviceImple.CustomerServiceImple;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

	@Autowired(required = true)
	private CustomerServiceImple customerServiceImple; 
	
	@GetMapping("/get")
	public List<Customer> obtainCustomer(){
		return customerServiceImple.getCustomer();
	}
	
	@PostMapping("/save")
	public Customer storeCustomer(@RequestBody Customer customer) {
		return customerServiceImple.saveCustomer(customer);
	}
	

	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerServiceImple.saveCustomer(customer);
	}
	
	
	@DeleteMapping("/delete")
	public String deleteCustomer(@RequestBody Customer customer) {
		customerServiceImple.deleteCustomer(customer);
		return "Deleted"+customer;
	}
}
