package com.ping.admin.api.connectionmodel;

import java.util.ArrayList;

public class Credentials {
	public ArrayList<Object> certs;
    public SigningSettings signingSettings;
	public ArrayList<Object> getCerts() {
		return certs;
	}
	public void setCerts(ArrayList<Object> certs) {
		this.certs = certs;
	}
	public SigningSettings getSigningSettings() {
		return signingSettings;
	}
	public void setSigningSettings(SigningSettings signingSettings) {
		this.signingSettings = signingSettings;
	}
	
    
}
