package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lid;
	private String model, ram;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(Long lid, String model, String ram) {
		super();
		this.lid = lid;
		this.model = model;
		this.ram = ram;
	}
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", model=" + model + ", ram=" + ram + "]";
	}
	
	
	
}
