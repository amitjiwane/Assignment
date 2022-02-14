package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6435578747208201814L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long schoolId;
	private String schoolName;
	
	@OneToMany(mappedBy = "school")
	private List<Student> studentList;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(Long schoolId, String schoolName, List<Student> studentList) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.studentList = studentList;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolId, schoolName, studentList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(schoolId, other.schoolId) && Objects.equals(schoolName, other.schoolName)
				&& Objects.equals(studentList, other.studentList);
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", studentList=" + studentList + "]";
	}

	
}
