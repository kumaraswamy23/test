package com.ping.admin.api.policymodel;

public class DisplayName{
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
	public DisplayName(Source source, String value) {
		super();
		this.source = source;
		this.value = value;
	}
	public DisplayName() {
		super();
	}
    
    
}
