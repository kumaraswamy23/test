package com.ping.admin.api.policymodel;

public class ActionMapping {
	public String type;
	public String context;
	public AuthenticationPolicyContractRef authenticationPolicyContractRef;
	public AttributeMapping attributeMapping;
    //public AuthenticationSelectorRef authenticationSelectorRef;
    //public AuthenticationSource authenticationSource;
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
	public AuthenticationPolicyContractRef getAuthenticationPolicyContractRef() {
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
	public ActionMapping(String type, String context, AuthenticationPolicyContractRef authenticationPolicyContractRef,
			AttributeMapping attributeMapping) {
		super();
		this.type = type;
		this.context = context;
		this.authenticationPolicyContractRef = authenticationPolicyContractRef;
		this.attributeMapping = attributeMapping;
	}
	public ActionMapping() {
		super();
	}
	
	
}
