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

import com.example.demo.entities.UserDetails;
import com.example.demo.repository.UserDetailsRepository;

@RestController
@RequestMapping("/user")
public class UserDetailsRestController {

	@Autowired
	private UserDetailsRepository userRepository;
	
	
	
	
	@GetMapping("/get")
	public List<UserDetails> getAllUsers() {
		return userRepository.findAll();
	}
	
	@PostMapping("/save") //http://localhost:8083/user/save
	public UserDetails saveUser(@RequestBody UserDetails user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/update")
	public UserDetails updateUser(@RequestBody UserDetails user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/delete")
	public String deleteUser(UserDetails user) {
		userRepository.delete(user);
		return "Deleted successfully"+user;
	}
}
