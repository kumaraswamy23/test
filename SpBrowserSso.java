package com.ping.admin.api.connectionmodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;



public class SpBrowserSso {
	
	//@Value("SAML20")
	public String protocol;
    public List<String> enabledProfiles = Arrays.asList("IDP_INITIATED_SSO","SP_INITIATED_SSO");
    public List<String> incomingBindings = Arrays.asList("POST","REDIRECT");
    public ArrayList<SsoServiceEndpoint> ssoServiceEndpoints;
    
    //@Value("${some.key:false}")
    public boolean signAssertions;
    
    //@Value("${some.key:true}")
    public boolean signResponseAsRequired;
    
    //@Value("STANDARD")
    public String spSamlIdentityMapping;
    
    //@Value("${some.key:false}")
    public boolean requireSignedAuthnRequests;
    
    
    public AssertionLifetime assertionLifetime;
    public EncryptionPolicy encryptionPolicy;
    public AttributeContract attributeContract;
    public ArrayList<Object> adapterMappings;
    public ArrayList<AuthenticationPolicyContractAssertionMapping> authenticationPolicyContractAssertionMappings;
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public List<String> getEnabledProfiles() {
		return enabledProfiles;
	}
	public void setEnabledProfiles(List<String> enabledProfiles) {
		this.enabledProfiles = enabledProfiles;
	}
	public List<String> getIncomingBindings() {
		return incomingBindings;
	}
	public void setIncomingBindings(List<String> incomingBindings) {
		this.incomingBindings = incomingBindings;
	}
	public ArrayList<SsoServiceEndpoint> getSsoServiceEndpoints() {
		return ssoServiceEndpoints;
	}
	public void setSsoServiceEndpoints(ArrayList<SsoServiceEndpoint> ssoServiceEndpoints) {
		this.ssoServiceEndpoints = ssoServiceEndpoints;
	}
	public boolean isSignAssertions() {
		return signAssertions;
	}
	public void setSignAssertions(boolean signAssertions) {
		this.signAssertions = signAssertions;
	}
	public boolean isSignResponseAsRequired() {
		return signResponseAsRequired;
	}
	public void setSignResponseAsRequired(boolean signResponseAsRequired) {
		this.signResponseAsRequired = signResponseAsRequired;
	}
	public String getSpSamlIdentityMapping() {
		return spSamlIdentityMapping;
	}
	public void setSpSamlIdentityMapping(String spSamlIdentityMapping) {
		this.spSamlIdentityMapping = spSamlIdentityMapping;
	}
	public boolean isRequireSignedAuthnRequests() {
		return requireSignedAuthnRequests;
	}
	public void setRequireSignedAuthnRequests(boolean requireSignedAuthnRequests) {
		this.requireSignedAuthnRequests = requireSignedAuthnRequests;
	}
	public AssertionLifetime getAssertionLifetime() {
		return assertionLifetime;
	}
	public void setAssertionLifetime(AssertionLifetime assertionLifetime) {
		this.assertionLifetime = assertionLifetime;
	}
	public EncryptionPolicy getEncryptionPolicy() {
		return encryptionPolicy;
	}
	public void setEncryptionPolicy(EncryptionPolicy encryptionPolicy) {
		this.encryptionPolicy = encryptionPolicy;
	}
	public AttributeContract getAttributeContract() {
		return attributeContract;
	}
	public void setAttributeContract(AttributeContract attributeContract) {
		this.attributeContract = attributeContract;
	}
	public ArrayList<Object> getAdapterMappings() {
		return adapterMappings;
	}
	public void setAdapterMappings(ArrayList<Object> adapterMappings) {
		this.adapterMappings = adapterMappings;
	}
	public ArrayList<AuthenticationPolicyContractAssertionMapping> getAuthenticationPolicyContractAssertionMappings() {
		return authenticationPolicyContractAssertionMappings;
	}
	public void setAuthenticationPolicyContractAssertionMappings(
			ArrayList<AuthenticationPolicyContractAssertionMapping> authenticationPolicyContractAssertionMappings) {
		this.authenticationPolicyContractAssertionMappings = authenticationPolicyContractAssertionMappings;
	}
	/*public SpBrowserSso(String protocol, ArrayList<String> enabledProfiles, ArrayList<String> incomingBindings,
			ArrayList<SsoServiceEndpoint> ssoServiceEndpoints, boolean signAssertions, boolean signResponseAsRequired,
			String spSamlIdentityMapping, boolean requireSignedAuthnRequests, AssertionLifetime assertionLifetime,
			EncryptionPolicy encryptionPolicy, AttributeContract attributeContract, ArrayList<Object> adapterMappings,
			ArrayList<AuthenticationPolicyContractAssertionMapping> authenticationPolicyContractAssertionMappings) {
		super();
		this.protocol = protocol;
		this.enabledProfiles = enabledProfiles;
		this.incomingBindings = incomingBindings;
		this.ssoServiceEndpoints = ssoServiceEndpoints;
		this.signAssertions = signAssertions;
		this.signResponseAsRequired = signResponseAsRequired;
		this.spSamlIdentityMapping = spSamlIdentityMapping;
		this.requireSignedAuthnRequests = requireSignedAuthnRequests;
		this.assertionLifetime = assertionLifetime;
		this.encryptionPolicy = encryptionPolicy;
		this.attributeContract = attributeContract;
		this.adapterMappings = adapterMappings;
		this.authenticationPolicyContractAssertionMappings = authenticationPolicyContractAssertionMappings;
	}*/
    
}
