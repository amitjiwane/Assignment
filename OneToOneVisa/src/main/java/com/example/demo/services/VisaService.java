package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Visa;

public interface VisaService {

	public List<Visa> getVisa();
	
	public Visa saveVisa(Visa visa);
	
	public Visa updateVisa(Visa visa);
	
	public String deleteVisa(Visa visa);

}
