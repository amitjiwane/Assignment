package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Order;

public interface OrderService {

public List<Order> getOrder();
	
	public Order saveOrder(Order order);
	
	public Order updateOrder(Order order);
	
	public String deleteOrder(Order order);
}
