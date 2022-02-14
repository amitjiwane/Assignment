package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3367979273444882717L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String studentName;
	
	@ManyToOne
	@JoinColumn(name = "s_Id")
	private School school;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long studentId, String studentName, School school) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.school = school;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", school=" + school + "]";
	}
	
	
	
	

}
