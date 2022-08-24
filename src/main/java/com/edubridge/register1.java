package com.edubridge;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class register1 {

	@Id
	String id;
	String email;
	String name;
	String city;
	String contact;
	String password;
	
	public register1(){}
	public register1(String id, String email, String name, String city, String contact, String password) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.city = city;
		this.contact = contact;
		this.password = password;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}


