package com.ping.admin.api.connectionmodel;

import org.springframework.beans.factory.annotation.Value;

public class SigningSettings {
	public SigningKeyPairRef signingKeyPairRef;
	
	//@Value("${some.key:false}")
    public boolean includeCertInSignature;
	
	//@Value("${some.key:false}")
    public boolean includeRawKeyInSignature;
	
	//@Value("SHA256withRSA")
    public String algorithm;
	public SigningKeyPairRef getSigningKeyPairRef() {
		return signingKeyPairRef;
	}
	public void setSigningKeyPairRef(SigningKeyPairRef signingKeyPairRef) {
		this.signingKeyPairRef = signingKeyPairRef;
	}
	public boolean isIncludeCertInSignature() {
		return includeCertInSignature;
	}
	public void setIncludeCertInSignature(boolean includeCertInSignature) {
		this.includeCertInSignature = includeCertInSignature;
	}
	public boolean isIncludeRawKeyInSignature() {
		return includeRawKeyInSignature;
	}
	public void setIncludeRawKeyInSignature(boolean includeRawKeyInSignature) {
		this.includeRawKeyInSignature = includeRawKeyInSignature;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	/*public SigningSettings(SigningKeyPairRef signingKeyPairRef, boolean includeCertInSignature,
			boolean includeRawKeyInSignature, String algorithm) {
		super();
		this.signingKeyPairRef = signingKeyPairRef;
		this.includeCertInSignature = includeCertInSignature;
		this.includeRawKeyInSignature = includeRawKeyInSignature;
		this.algorithm = algorithm;
	}*/
    
}
