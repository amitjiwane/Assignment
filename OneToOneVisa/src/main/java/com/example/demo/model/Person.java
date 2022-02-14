package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4100607884865064767L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
	private Visa visa;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Long id, String name, Visa visa) {
		super();
		this.id = id;
		this.name = name;
		this.visa = visa;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Visa getVisa() {
		return visa;
	}
	public void setVisa(Visa visa) {
		this.visa = visa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, visa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(visa, other.visa);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", visa=" + visa + "]";
	}
	
	
}
