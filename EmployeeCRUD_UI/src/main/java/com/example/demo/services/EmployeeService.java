package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(Long id);
	
	public String deleteEmployeeById(Long id);
}
