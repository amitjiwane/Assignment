package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.services.EmployeeService;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired(required = true)
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);
		return "Deleted"+employee;
	}
	
	
}
