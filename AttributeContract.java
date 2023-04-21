package com.ping.admin.api.connectionmodel;

import java.util.ArrayList;

public class AttributeContract {
	private ArrayList<AttributesFormat> coreAttributes;
    private ArrayList<AttributesFormat> extendedAttributes;
	
    public ArrayList<AttributesFormat> getCoreAttributes() {
		return coreAttributes;
	}
	public void setCoreAttributes(ArrayList<AttributesFormat> coreAttributes) {
		this.coreAttributes = coreAttributes;
	}
	public ArrayList<AttributesFormat> getExtendedAttributes() {
		return extendedAttributes;
	}
	public void setExtendedAttributes(ArrayList<AttributesFormat> extendedAttributes) {
		this.extendedAttributes = extendedAttributes;
	}
	public AttributeContract(ArrayList<AttributesFormat> coreAttributes, ArrayList<AttributesFormat> extendedAttributes) {
		super();
		this.coreAttributes = coreAttributes;
		this.extendedAttributes = extendedAttributes;
	}
    
    
}
