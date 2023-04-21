package com.ping.admin.api.connectionmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttributeContractFulfillment {
	public Firstname firstname;
    @JsonProperty("SAML_SUBJECT") 
    public SAMLSUBJECT sAML_SUBJECT;
    public Lastname lastname;
	public Firstname getFirstname() {
		return firstname;
	}
	public void setFirstname(Firstname firstname) {
		this.firstname = firstname;
	}
	public SAMLSUBJECT getsAML_SUBJECT() {
		return sAML_SUBJECT;
	}
	public void setsAML_SUBJECT(SAMLSUBJECT sAML_SUBJECT) {
		this.sAML_SUBJECT = sAML_SUBJECT;
	}
	public Lastname getLastname() {
		return lastname;
	}
	public void setLastname(Lastname lastname) {
		this.lastname = lastname;
	}
	public AttributeContractFulfillment(Firstname firstname, SAMLSUBJECT sAML_SUBJECT, Lastname lastname) {
		super();
		this.firstname = firstname;
		this.sAML_SUBJECT = sAML_SUBJECT;
		this.lastname = lastname;
	}
    
}
