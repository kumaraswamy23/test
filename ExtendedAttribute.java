package com.ping.admin.api.connectionmodel;

public class ExtendedAttribute {
	public String name;
    public String nameFormat;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameFormat() {
		return nameFormat;
	}
	public void setNameFormat(String nameFormat) {
		this.nameFormat = nameFormat;
	}
	public ExtendedAttribute(String name, String nameFormat) {
		super();
		this.name = name;
		this.nameFormat = nameFormat;
	}
    
}
