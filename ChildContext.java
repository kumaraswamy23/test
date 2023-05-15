package com.ping.admin.api.policymodel;

public class ChildContext {
	public Object action;

	public Object getAction() {
		return action;
	}

	public void setAction(Object action) {
		this.action = action;
	}

	public ChildContext(Object action) {
		super();
		this.action = action;
	}
	
}
