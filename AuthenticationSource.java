package com.ping.admin.api.policymodel;

public class AuthenticationSource{
    public String type;
    public SourceRef sourceRef;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public SourceRef getSourceRef() {
		return sourceRef;
	}
	public void setSourceRef(SourceRef sourceRef) {
		this.sourceRef = sourceRef;
	}
	public AuthenticationSource(String type, SourceRef sourceRef) {
		super();
		this.type = type;
		this.sourceRef = sourceRef;
	}
	public AuthenticationSource() {
		super();
	}
    
    
}
