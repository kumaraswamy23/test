package com.ping.admin.api.pcvmodel;

public class Field {
	public String name;
    public String value;
    //public String encryptedValue;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	public Field() {
		
	}
	public Field(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	
    
}
