package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Laptop;

public interface LaptopService {
	
	public List<Laptop> getLaptop();
	
	public Laptop saveLaptop(Laptop laptop);
	
	public String deleteLaptop(Laptop laptop);

}
