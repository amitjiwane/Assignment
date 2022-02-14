package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.services.DepartmentService;

@Service
public class DepartmentServiceImple implements DepartmentService {

	@Autowired(required = true)
	private DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public String deleteDepartment(Department department) {
		// TODO Auto-generated method stub
		departmentRepository.delete(department);
		return "delete successfully"+department;
		
	}

}
