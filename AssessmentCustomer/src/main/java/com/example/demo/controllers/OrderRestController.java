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

import com.example.demo.model.Order;
import com.example.demo.serviceImple.OrderServiceImple;

@RestController
@RequestMapping("/order")
public class OrderRestController {

	@Autowired(required = true)
	private OrderServiceImple orderServiceImple;
	

	@GetMapping("/get")
	public List<Order> obtainOrder(){
		return orderServiceImple.getOrder();
	
	}
	
	@PostMapping("/save")
	public Order storeOrder(@RequestBody Order order) {
		return orderServiceImple.saveOrder(order);
	}
	

	@PutMapping("/update")
	public Order updateOrder(@RequestBody Order order) {
		return orderServiceImple.saveOrder(order);
	}
	
	
	@DeleteMapping("/delete")
	public String deleteCustomer(@RequestBody Order order) {
		orderServiceImple.deleteOrder(order);
		return "Deleted"+order;
	}
}
