package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Laptop;
import com.example.demo.repository.LaptopRepository;
import com.example.demo.service.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService{

	@Autowired
	private LaptopRepository laptopRepository;

	
	@Override
	public Laptop saveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public List<Laptop> getLaptop(List<Laptop> laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public Laptop updateLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public String deleteLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopRepository.delete(laptop);
		return "Delete Successfully"+laptop;
	}
	

}
