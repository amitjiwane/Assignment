package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5139100236047283654L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
	private String name, address, phone;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(long pid, String name, String address, String phone) {
		super();
		this.pid = pid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
}
