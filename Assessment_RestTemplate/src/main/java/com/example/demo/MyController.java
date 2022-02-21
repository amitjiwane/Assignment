package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/get")
	public String consumeRest() {
		String url="https://gorest.co.in/public/v2/users";
		
		return restTemplate.getForEntity(url, String.class).getBody();
	}
}
