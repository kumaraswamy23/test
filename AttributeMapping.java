package com.ping.admin.api.adaptermodel;

import java.util.ArrayList;

public class AttributeMapping{
    public ArrayList<Object> attributeSources;
    public AttributeContractFulfillment attributeContractFulfillment;
    public IssuanceCriteria issuanceCriteria;
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
	public AttributeMapping(ArrayList<Object> attributeSources,
			AttributeContractFulfillment attributeContractFulfillment, IssuanceCriteria issuanceCriteria) {
		super();
		this.attributeSources = attributeSources;
		this.attributeContractFulfillment = attributeContractFulfillment;
		this.issuanceCriteria = issuanceCriteria;
	}
	public AttributeMapping() {
		super();
	}
    
    
    
}
