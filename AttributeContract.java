package com.ping.admin.api.pcvmodel;

import java.util.ArrayList;

public class AttributeContract {
	public ArrayList<CoreAttribute> coreAttributes;
    public ArrayList<Object> extendedAttributes;
	public ArrayList<CoreAttribute> getCoreAttributes() {
		return coreAttributes;
	}
	public void setCoreAttributes(ArrayList<CoreAttribute> coreAttributes) {
		this.coreAttributes = coreAttributes;
	}
	public ArrayList<Object> getExtendedAttributes() {
		return extendedAttributes;
	}
	public void setExtendedAttributes(ArrayList<Object> extendedAttributes) {
		this.extendedAttributes = extendedAttributes;
	}
	public AttributeContract(ArrayList<CoreAttribute> coreAttributes, ArrayList<Object> extendedAttributes) {
		super();
		this.coreAttributes = coreAttributes;
		this.extendedAttributes = extendedAttributes;
	}
	public AttributeContract() {
		super();
	}
    
    
}
