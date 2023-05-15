package com.ping.admin.api.policymodel;

public class Mail{
    public Source source;
    public String value;
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Mail(Source source, String value) {
		super();
		this.source = source;
		this.value = value;
	}
	public Mail() {
		super();
	}
    
    
}
