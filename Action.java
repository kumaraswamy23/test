package com.ping.admin.api.policymodel;

public class Action{
    public String type;
    //public AuthenticationSelectorRef authenticationSelectorRef;
    public String context;
    public AuthenticationSource authenticationSource;
    //public AuthenticationPolicyContractRef authenticationPolicyContractRef;
    //public AttributeMapping attributeMapping;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	/*public AuthenticationSelectorRef getAuthenticationSelectorRef() {
		return authenticationSelectorRef;
	}
	public void setAuthenticationSelectorRef(AuthenticationSelectorRef authenticationSelectorRef) {
		this.authenticationSelectorRef = authenticationSelectorRef;
	}*/
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public AuthenticationSource getAuthenticationSource() {
		return authenticationSource;
	}
	public void setAuthenticationSource(AuthenticationSource authenticationSource) {
		this.authenticationSource = authenticationSource;
	}
	/*public AuthenticationPolicyContractRef getAuthenticationPolicyContractRef() {
		return authenticationPolicyContractRef;
	}
	public void setAuthenticationPolicyContractRef(AuthenticationPolicyContractRef authenticationPolicyContractRef) {
		this.authenticationPolicyContractRef = authenticationPolicyContractRef;
	}
	public AttributeMapping getAttributeMapping() {
		return attributeMapping;
	}
	public void setAttributeMapping(AttributeMapping attributeMapping) {
		this.attributeMapping = attributeMapping;
	}
	public Action(String type, AuthenticationSelectorRef authenticationSelectorRef, String context,
			AuthenticationSource authenticationSource, AuthenticationPolicyContractRef authenticationPolicyContractRef,
			AttributeMapping attributeMapping) {
		super();
		this.type = type;
		this.authenticationSelectorRef = authenticationSelectorRef;
		this.context = context;
		this.authenticationSource = authenticationSource;
		this.authenticationPolicyContractRef = authenticationPolicyContractRef;
		this.attributeMapping = attributeMapping;
	}*/
	
	
	public Action() {
		super();
	}
	public Action(String type, String context, AuthenticationSource authenticationSource) {
		super();
		this.type = type;
		this.context = context;
		this.authenticationSource = authenticationSource;
	}
    
    
}
