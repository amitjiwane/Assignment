package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Laptop;


public interface LaptopService {

	public Laptop saveLaptop(Laptop laptop);
	
	public List<Laptop> getLaptop(List<Laptop> laptop);
	
	public Laptop updateLaptop(Laptop laptop);
	
	public String deleteLaptop(Laptop laptop);
}
