package com.ping.admin.api.adaptermodel;

public class ExtendedAttribute{
    public String name;
    public boolean masked;
    public boolean pseudonym;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMasked() {
		return masked;
	}
	public void setMasked(boolean masked) {
		this.masked = masked;
	}
	public boolean isPseudonym() {
		return pseudonym;
	}
	public void setPseudonym(boolean pseudonym) {
		this.pseudonym = pseudonym;
	}
	public ExtendedAttribute(String name, boolean masked, boolean pseudonym) {
		super();
		this.name = name;
		this.masked = masked;
		this.pseudonym = pseudonym;
	}
	public ExtendedAttribute() {
		super();
	}
    
    
}
