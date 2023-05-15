package com.ping.admin.api.policymodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttributeContractFulfillment{
    public Uid uid;
    public Mail mail;
    public DisplayName displayName;
    public Subject subject;
    public FsOrgFriendlyName fsOrgFriendlyName;
    public GivenName givenName;
    public Sn sn;
    @JsonProperty("RiskLevel") 
    public RiskLevel riskLevel;
    public FsFriendlyName fsFriendlyName;
    public FsScope fsScope;
    public FsFriendlyId fsFriendlyId;
    public Username username;
	public Uid getUid() {
		return uid;
	}
	public void setUid(Uid uid) {
		this.uid = uid;
	}
	public Mail getMail() {
		return mail;
	}
	public void setMail(Mail mail) {
		this.mail = mail;
	}
	public DisplayName getDisplayName() {
		return displayName;
	}
	public void setDisplayName(DisplayName displayName) {
		this.displayName = displayName;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public FsOrgFriendlyName getFsOrgFriendlyName() {
		return fsOrgFriendlyName;
	}
	public void setFsOrgFriendlyName(FsOrgFriendlyName fsOrgFriendlyName) {
		this.fsOrgFriendlyName = fsOrgFriendlyName;
	}
	public GivenName getGivenName() {
		return givenName;
	}
	public void setGivenName(GivenName givenName) {
		this.givenName = givenName;
	}
	public Sn getSn() {
		return sn;
	}
	public void setSn(Sn sn) {
		this.sn = sn;
	}
	public RiskLevel getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(RiskLevel riskLevel) {
		this.riskLevel = riskLevel;
	}
	public FsFriendlyName getFsFriendlyName() {
		return fsFriendlyName;
	}
	public void setFsFriendlyName(FsFriendlyName fsFriendlyName) {
		this.fsFriendlyName = fsFriendlyName;
	}
	public FsScope getFsScope() {
		return fsScope;
	}
	public void setFsScope(FsScope fsScope) {
		this.fsScope = fsScope;
	}
	public FsFriendlyId getFsFriendlyId() {
		return fsFriendlyId;
	}
	public void setFsFriendlyId(FsFriendlyId fsFriendlyId) {
		this.fsFriendlyId = fsFriendlyId;
	}
	public Username getUsername() {
		return username;
	}
	public void setUsername(Username username) {
		this.username = username;
	}
	public AttributeContractFulfillment(Uid uid, Mail mail, DisplayName displayName, Subject subject,
			FsOrgFriendlyName fsOrgFriendlyName, GivenName givenName, Sn sn, RiskLevel riskLevel,
			FsFriendlyName fsFriendlyName, FsScope fsScope, FsFriendlyId fsFriendlyId, Username username) {
		super();
		this.uid = uid;
		this.mail = mail;
		this.displayName = displayName;
		this.subject = subject;
		this.fsOrgFriendlyName = fsOrgFriendlyName;
		this.givenName = givenName;
		this.sn = sn;
		this.riskLevel = riskLevel;
		this.fsFriendlyName = fsFriendlyName;
		this.fsScope = fsScope;
		this.fsFriendlyId = fsFriendlyId;
		this.username = username;
	}
	public AttributeContractFulfillment() {
		super();
	}
    
    
}
