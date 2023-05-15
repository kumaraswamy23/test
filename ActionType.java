package com.ping.admin.api.policymodel;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ActionType {
	public String type;
    public AuthenticationSelectorRef authenticationSelectorRef;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public AuthenticationSelectorRef getAuthenticationSelectorRef() {
		return authenticationSelectorRef;
	}
	public void setAuthenticationSelectorRef(AuthenticationSelectorRef authenticationSelectorRef) {
		this.authenticationSelectorRef = authenticationSelectorRef;
	}
	public ActionType(String type, AuthenticationSelectorRef authenticationSelectorRef) {
		super();
		this.type = type;
		this.authenticationSelectorRef = authenticationSelectorRef;
	}
	public ActionType() {
		super();
	}
    
    
}
