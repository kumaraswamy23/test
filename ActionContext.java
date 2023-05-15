package com.ping.admin.api.policymodel;

public class ActionContext {

	public String type;
	public String context;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public ActionContext(String type, String context) {
		super();
		this.type = type;
		this.context = context;
	}
	public ActionContext() {
		super();
	}
	
	
}
