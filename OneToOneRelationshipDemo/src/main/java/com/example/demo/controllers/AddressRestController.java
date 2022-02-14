package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Address;
import com.example.demo.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressRestController {

	@Autowired
	private AddressRepository addressRepository;
	
	@GetMapping("/get")
	public List<Address> getAllAddress(){
		return addressRepository.findAll();
	}
	
	@PostMapping("/save")
	public List<Address> saveAddress(@RequestBody List<Address> address) {
		return addressRepository.saveAll(address);
	}
	
	@PutMapping("/update")
	public Address updateAddress(@RequestBody Address address) {
		return addressRepository.save(address);
	}
	
	@DeleteMapping("/delete")
	public String deleteAddress(Address address) {
		addressRepository.deleteAll();
		return "Delete Successfully"+address;
	}
}
