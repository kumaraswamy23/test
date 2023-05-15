package com.ping.admin.api.policymodel;

public class Source{
    public String type;
    public String id;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Source(String type, String id) {
		super();
		this.type = type;
		this.id = id;
	}
	public Source() {
		super();
	}
    
    
}
