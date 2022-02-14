package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.model.OrderItem;
import com.example.demo.repository.OrderItemRepository;
import com.example.demo.service.OrderItemService;

@Service
public class OrderItemServiceImple implements OrderItemService{
	
	@Autowired(required = true)
	private OrderItemRepository orderItemRepository;

	@Override
	public List<OrderItem> getOrderItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem saveOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem updateOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
