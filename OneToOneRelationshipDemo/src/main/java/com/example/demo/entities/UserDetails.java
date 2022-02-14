package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Details")
public class UserDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6621092627958667603L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String userName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, userId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		return Objects.equals(address, other.address) && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", address=" + address + "]";
	}
	
	
	

}
