package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -387428356148350492L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lid;
	private String cpu, hdd, ram;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(Long lid, String cpu, String hdd, String ram, Employee employee) {
		super();
		this.lid = lid;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.employee = employee;
	}

	public Long getLid() {
		return lid;
	}

	public void setLid(Long lid) {
		this.lid = lid;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpu, employee, hdd, lid, ram);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(cpu, other.cpu) && Objects.equals(employee, other.employee)
				&& Objects.equals(hdd, other.hdd) && Objects.equals(lid, other.lid) && Objects.equals(ram, other.ram);
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", employee=" + employee + "]";
	}

	
	
}
