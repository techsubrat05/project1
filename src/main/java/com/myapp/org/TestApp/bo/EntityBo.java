package com.myapp.org.TestApp.bo;

import org.springframework.stereotype.Component;

@Component
public class EntityBo {
	
	public String name;
	public String address;
	public String dateOfBirth;
	public EntityBo(String name, String address, String dateOfBirth) {
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
