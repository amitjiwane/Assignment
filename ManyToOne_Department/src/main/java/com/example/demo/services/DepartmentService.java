package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {

	
	public List<Department> getDepartment();

	public Department saveDepartment(Department department);
	
	public Department updateDepartment(Department department);
	
	public String deleteEmployee(Department department);

}
