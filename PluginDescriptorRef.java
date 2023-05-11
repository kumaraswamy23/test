package com.ping.admin.api.pcvmodel;

public class PluginDescriptorRef {
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
	public PluginDescriptorRef(String id, String location) {
		super();
		this.id = id;
		this.location = location;
	}
    
}
