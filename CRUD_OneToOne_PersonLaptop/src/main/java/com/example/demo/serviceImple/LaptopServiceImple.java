package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;
import com.example.demo.services.LaptopService;

@Service
public class LaptopServiceImple implements LaptopService{

	private LaptopRepository laptopRepository;
	@Override
	public List<Laptop> getLaptop() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public Laptop saveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public String deleteLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopRepository.delete(laptop);
		return "Deleted";
	}

}
