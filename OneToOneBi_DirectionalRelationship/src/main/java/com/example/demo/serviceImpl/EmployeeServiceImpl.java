package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Department;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Department saveEmployee(Department employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Department> getEmployee(List<Department> employee) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Department updateEmployee(Department employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployee(Department employee) {
		employeeRepository.delete(employee);
		return "Deleted Successfully"+employee;
	}

	 
}
