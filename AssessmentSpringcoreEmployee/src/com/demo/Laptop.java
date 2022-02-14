package com.demo;

public class Laptop {

	private Long lid;
	private String cpu, hdd, ram;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(Long lid, String cpu, String hdd, String ram) {
		super();
		this.lid = lid;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
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
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}
	
	
}
