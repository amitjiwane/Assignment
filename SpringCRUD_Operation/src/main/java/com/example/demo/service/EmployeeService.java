package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository repository;

	//Post methods
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployees(List<Employee> employees) {
		return repository.saveAll(employees);
	}
	
	//Get methods
	public List<Employee> getAllData() {
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
//	public Employee updateEmployee(Employee employee) {
//		Employee existingEmployee=repository.findById(employee.getEmployeeId())
//	}
	
	
	
}
