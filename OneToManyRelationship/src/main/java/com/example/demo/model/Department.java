package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4963627714889926648L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "d_Id")
	private Long dId;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private List<Student> student;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long dId, String name, List<Student> student) {
		super();
		this.dId = dId;
		this.name = name;
		this.student = student;
	}

	public Long getdId() {
		return dId;
	}

	public void setdId(Long dId) {
		this.dId = dId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", name=" + name + ", student=" + student + "]";
	}

	
	

}
