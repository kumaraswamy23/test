package com.ping.admin.api.connectionmodel;

import java.util.ArrayList;

public class AuthenticationPolicyContractAssertionMapping {
	public ArrayList<Object> attributeSources;
    public AttributeContractFulfillment attributeContractFulfillment;
    public IssuanceCriteria issuanceCriteria;
    public AuthenticationPolicyContractRef authenticationPolicyContractRef;
    public boolean restrictVirtualEntityIds;
    public ArrayList<Object> restrictedVirtualEntityIds;
    public boolean abortSsoTransactionAsFailSafe;
	public ArrayList<Object> getAttributeSources() {
		return attributeSources;
	}
	public void setAttributeSources(ArrayList<Object> attributeSources) {
		this.attributeSources = attributeSources;
	}
	public AttributeContractFulfillment getAttributeContractFulfillment() {
		return attributeContractFulfillment;
	}
	public void setAttributeContractFulfillment(AttributeContractFulfillment attributeContractFulfillment) {
		this.attributeContractFulfillment = attributeContractFulfillment;
	}
	public IssuanceCriteria getIssuanceCriteria() {
		return issuanceCriteria;
	}
	public void setIssuanceCriteria(IssuanceCriteria issuanceCriteria) {
		this.issuanceCriteria = issuanceCriteria;
	}
	public AuthenticationPolicyContractRef getAuthenticationPolicyContractRef() {
		return authenticationPolicyContractRef;
	}
	public void setAuthenticationPolicyContractRef(AuthenticationPolicyContractRef authenticationPolicyContractRef) {
		this.authenticationPolicyContractRef = authenticationPolicyContractRef;
	}
	public boolean isRestrictVirtualEntityIds() {
		return restrictVirtualEntityIds;
	}
	public void setRestrictVirtualEntityIds(boolean restrictVirtualEntityIds) {
		this.restrictVirtualEntityIds = restrictVirtualEntityIds;
	}
	public ArrayList<Object> getRestrictedVirtualEntityIds() {
		return restrictedVirtualEntityIds;
	}
	public void setRestrictedVirtualEntityIds(ArrayList<Object> restrictedVirtualEntityIds) {
		this.restrictedVirtualEntityIds = restrictedVirtualEntityIds;
	}
	public boolean isAbortSsoTransactionAsFailSafe() {
		return abortSsoTransactionAsFailSafe;
	}
	public void setAbortSsoTransactionAsFailSafe(boolean abortSsoTransactionAsFailSafe) {
		this.abortSsoTransactionAsFailSafe = abortSsoTransactionAsFailSafe;
	}
	public AuthenticationPolicyContractAssertionMapping(ArrayList<Object> attributeSources,
			AttributeContractFulfillment attributeContractFulfillment, IssuanceCriteria issuanceCriteria,
			AuthenticationPolicyContractRef authenticationPolicyContractRef, boolean restrictVirtualEntityIds,
			ArrayList<Object> restrictedVirtualEntityIds, boolean abortSsoTransactionAsFailSafe) {
		super();
		this.attributeSources = attributeSources;
		this.attributeContractFulfillment = attributeContractFulfillment;
		this.issuanceCriteria = issuanceCriteria;
		this.authenticationPolicyContractRef = authenticationPolicyContractRef;
		this.restrictVirtualEntityIds = restrictVirtualEntityIds;
		this.restrictedVirtualEntityIds = restrictedVirtualEntityIds;
		this.abortSsoTransactionAsFailSafe = abortSsoTransactionAsFailSafe;
	}
    
}
