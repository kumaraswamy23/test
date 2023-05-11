package com.ping.admin.api.pcvmodel;

public class EncryptedField {
	public String name;
    public String encryptedValue;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEncryptedValue() {
		return encryptedValue;
	}
	public void setEncryptedValue(String encryptedValue) {
		this.encryptedValue = encryptedValue;
	}
	public EncryptedField(String name, String encryptedValue) {
		super();
		this.name = name;
		this.encryptedValue = encryptedValue;
	}
	public EncryptedField() {
		super();
	}
    
    
}
