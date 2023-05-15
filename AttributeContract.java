package com.ping.admin.api.adaptermodel;

import java.util.ArrayList;

public class AttributeContract{
    public ArrayList<CoreAttribute> coreAttributes;
    public ArrayList<ExtendedAttribute> extendedAttributes;
    public boolean maskOgnlValues;
	public ArrayList<CoreAttribute> getCoreAttributes() {
		return coreAttributes;
	}
	public void setCoreAttributes(ArrayList<CoreAttribute> coreAttributes) {
		this.coreAttributes = coreAttributes;
	}
	public ArrayList<ExtendedAttribute> getExtendedAttributes() {
		return extendedAttributes;
	}
	public void setExtendedAttributes(ArrayList<ExtendedAttribute> extendedAttributes) {
		this.extendedAttributes = extendedAttributes;
	}
	public boolean isMaskOgnlValues() {
		return maskOgnlValues;
	}
	public void setMaskOgnlValues(boolean maskOgnlValues) {
		this.maskOgnlValues = maskOgnlValues;
	}
	public AttributeContract(ArrayList<CoreAttribute> coreAttributes, ArrayList<ExtendedAttribute> extendedAttributes,
			boolean maskOgnlValues) {
		super();
		this.coreAttributes = coreAttributes;
		this.extendedAttributes = extendedAttributes;
		this.maskOgnlValues = maskOgnlValues;
	}
	public AttributeContract() {
		super();
	}
    
    
}
