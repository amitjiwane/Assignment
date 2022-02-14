package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6371179068980404128L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String fullName;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Order> order;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long id, String fullName, String email, List<Order> order) {
		super();
		Id = id;
		this.fullName = fullName;
		this.email = email;
		this.order = order;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, email, fullName, order);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(email, other.email)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(order, other.order);
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", fullName=" + fullName + ", email=" + email + ", order=" + order + "]";
	}
	
	
	
}
