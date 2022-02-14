package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {
	
	//Get
	public List<Department> getDepartment();
	
	//post
	public Department saveDepartment(Department department);
	
	//Put
	public Department updateDepartment(Department department);
	
	//delete
	public String deleteDepartment(Department delete);

}
