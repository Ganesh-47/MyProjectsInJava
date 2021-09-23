package com.aspire.register;

import java.io.Serializable;

public class User implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 4544152852555896908L;
	private String firstName;
	private String lastName;
	private String email;
	public String getFirstName() {
		return firstName;
	}
	public  User(String firstName,String lastName,String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
}
