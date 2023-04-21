package com.ping.admin.api.connectionmodel;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

//@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class ContactInfo {
	//@JsonIgnore
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
