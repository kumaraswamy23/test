package com.ping.admin.api.policymodel;

public class AuthenticationApiApplicationRef{
    public String id;
    public String location;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public AuthenticationApiApplicationRef(String id, String location) {
		super();
		this.id = id;
		this.location = location;
	}
	public AuthenticationApiApplicationRef() {
		super();
	}
    
    
}
