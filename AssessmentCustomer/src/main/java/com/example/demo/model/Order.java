package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7085455794251675948L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private Double totalPrice;
	private String status; 
	private String shipmentAddress;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date shipmentDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private OrderItem orderItem;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Order(Long id, Double totalPrice, String status, String shipmentAddress, Date shipmentDate,
			OrderItem orderItem) {
		super();
		Id = id;
		this.totalPrice = totalPrice;
		this.status = status;
		this.shipmentAddress = shipmentAddress;
		this.shipmentDate = shipmentDate;
		this.orderItem = orderItem;
	}




	public Long getId() {
		return Id;
	}




	public void setId(Long id) {
		Id = id;
	}




	public Double getTotalPrice() {
		return totalPrice;
	}




	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public String getShipmentAddress() {
		return shipmentAddress;
	}




	public void setShipmentAddress(String shipmentAddress) {
		this.shipmentAddress = shipmentAddress;
	}




	public Date getShipmentDate() {
		return shipmentDate;
	}




	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}




	public OrderItem getOrderItem() {
		return orderItem;
	}




	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public int hashCode() {
		return Objects.hash(Id, orderItem, shipmentAddress, shipmentDate, status, totalPrice);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(orderItem, other.orderItem)
				&& Objects.equals(shipmentAddress, other.shipmentAddress)
				&& Objects.equals(shipmentDate, other.shipmentDate) && Objects.equals(status, other.status)
				&& Objects.equals(totalPrice, other.totalPrice);
	}




	@Override
	public String toString() {
		return "Order [Id=" + Id + ", totalPrice=" + totalPrice + ", status=" + status + ", shipmentAddress="
				+ shipmentAddress + ", shipmentDate=" + shipmentDate + ", orderItem=" + orderItem + "]";
	}


	
	
	
	
}
