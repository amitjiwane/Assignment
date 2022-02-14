package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Visa;
import com.example.demo.repository.VisaRepository;
import com.example.demo.services.VisaService;

@Service
public class VisaServiceImple implements VisaService{

	@Autowired(required = true)
	private VisaRepository visaRepository;
	
	@Override
	public List<Visa> getVisa() {
		// TODO Auto-generated method stub
		return visaRepository.findAll();
	}

	@Override
	public Visa saveVisa(Visa visa) {
		// TODO Auto-generated method stub
		return visaRepository.save(visa);
	}

	@Override
	public Visa updateVisa(Visa visa) {
		// TODO Auto-generated method stub
		return visaRepository.save(visa);
	}

	@Override
	public String deleteVisa(Visa visa) {
		// TODO Auto-generated method stub
		visaRepository.delete(visa);
		return "Deleted";
	}

}
