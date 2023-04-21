package com.ping.admin.api.connectionmodel;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;

public class EncryptionPolicy {
	
	//@Value("${some.key:false}")
	public boolean encryptAssertion;
	
	//@Value("${some.key:false}")
    public boolean encryptSloSubjectNameId;
	
	//@Value("${some.key:false}")
    public boolean sloSubjectNameIDEncrypted;
    public ArrayList<Object> encryptedAttributes;
	public boolean isEncryptAssertion() {
		return encryptAssertion;
	}
	public void setEncryptAssertion(boolean encryptAssertion) {
		this.encryptAssertion = encryptAssertion;
	}
	public boolean isEncryptSloSubjectNameId() {
		return encryptSloSubjectNameId;
	}
	public void setEncryptSloSubjectNameId(boolean encryptSloSubjectNameId) {
		this.encryptSloSubjectNameId = encryptSloSubjectNameId;
	}
	public boolean isSloSubjectNameIDEncrypted() {
		return sloSubjectNameIDEncrypted;
	}
	public void setSloSubjectNameIDEncrypted(boolean sloSubjectNameIDEncrypted) {
		this.sloSubjectNameIDEncrypted = sloSubjectNameIDEncrypted;
	}
	public ArrayList<Object> getEncryptedAttributes() {
		return encryptedAttributes;
	}
	public void setEncryptedAttributes(ArrayList<Object> encryptedAttributes) {
		this.encryptedAttributes = encryptedAttributes;
	}
	public EncryptionPolicy(boolean encryptAssertion, boolean encryptSloSubjectNameId,
			boolean sloSubjectNameIDEncrypted, ArrayList<Object> encryptedAttributes) {
		super();
		this.encryptAssertion = encryptAssertion;
		this.encryptSloSubjectNameId = encryptSloSubjectNameId;
		this.sloSubjectNameIDEncrypted = sloSubjectNameIDEncrypted;
		this.encryptedAttributes = encryptedAttributes;
	}
    
}
