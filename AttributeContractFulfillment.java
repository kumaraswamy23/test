package com.ping.admin.api.adaptermodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttributeContractFulfillment{
    public Uid uid;
    public Mail mail;
    @JsonProperty("policy.action")
    public PolicyAction policyaction;
    public DisplayName displayName;
    //public FsOrgFriendlyName fsOrgFriendlyName;
    //public GivenName givenName;
    //public Sn sn;
    //public FsFriendlyName fsFriendlyName;
    //public FsScope fsScope;
    //public Useraccount useraccount;
    //public FsFriendlyId fsFriendlyId;
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
	public PolicyAction getPolicyaction() {
		return policyaction;
	}
	public void setPolicyaction(PolicyAction policyaction) {
		this.policyaction = policyaction;
	}
	public DisplayName getDisplayName() {
		return displayName;
	}
	public void setDisplayName(DisplayName displayName) {
		this.displayName = displayName;
	}
	/*public FsOrgFriendlyName getFsOrgFriendlyName() {
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
	public Useraccount getUseraccount() {
		return useraccount;
	}
	public void setUseraccount(Useraccount useraccount) {
		this.useraccount = useraccount;
	}
	public FsFriendlyId getFsFriendlyId() {
		return fsFriendlyId;
	}
	public void setFsFriendlyId(FsFriendlyId fsFriendlyId) {
		this.fsFriendlyId = fsFriendlyId;
	}*/
	public Username getUsername() {
		return username;
	}
	public void setUsername(Username username) {
		this.username = username;
	}
	
	public AttributeContractFulfillment() {
		super();
	}
	public AttributeContractFulfillment(Uid uid, Mail mail, DisplayName displayName) {
		super();
		this.uid = uid;
		this.mail = mail;
		this.displayName = displayName;
	}
    
    
}
