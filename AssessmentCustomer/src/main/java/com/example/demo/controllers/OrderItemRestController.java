package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderItem;
import com.example.demo.serviceImple.OrderItemServiceImple;

@RestController
@RequestMapping("/orderItem")
public class OrderItemRestController {

	@Autowired(required = true)
	private OrderItemServiceImple orderItemServiceImple;
	
//	@GetMapping("/get")
//	public List<OrderItem> obtainOrderItem(){
//		return orderItemServiceImple.getOrderItem();
//	}
//	
//	
//	@PostMapping("/save")
//	public List<OrderItem> obtainOrderItem(){
//		return orderItemServiceImple.getOrderItem();
//	}
}
