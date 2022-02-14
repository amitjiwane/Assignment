package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;


@Service
public class CustomerServiceImple implements CustomerService{

	@Autowired(required = true)
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public String deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.delete(customer);
		return "Deleted"+customer;
	}

}
