package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Visa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2285241415473258623L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long visaId;
	private String visaType;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	public Visa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Visa(Long visaId, String visaType, Person person) {
		super();
		this.visaId = visaId;
		this.visaType = visaType;
		this.person = person;
	}
	public Long getVisaId() {
		return visaId;
	}
	public void setVisaId(Long visaId) {
		this.visaId = visaId;
	}
	public String getVisaType() {
		return visaType;
	}
	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(person, visaId, visaType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visa other = (Visa) obj;
		return Objects.equals(person, other.person) && Objects.equals(visaId, other.visaId)
				&& Objects.equals(visaType, other.visaType);
	}
	@Override
	public String toString() {
		return "Visa [visaId=" + visaId + ", visaType=" + visaType + ", person=" + person + "]";
	}
	
	
}
