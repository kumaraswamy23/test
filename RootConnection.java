package com.ping.admin.api.connectionmodel;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;

public class RootConnection {
	
	
	public String type;
    public String id;
    public String name;
    public String entityId;
    
    
    public boolean active;
    public ContactInfo contactInfo;
    
    
    public String loggingMode;
    public ArrayList<Object> virtualEntityIds;
    public String licenseConnectionGroup;
    
    public Credentials credentials;
    
    public SpBrowserSso spBrowserSso;
    public String connectionTargetType;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getLoggingMode() {
		return loggingMode;
	}
	public void setLoggingMode(String loggingMode) {
		this.loggingMode = loggingMode;
	}
	public ArrayList<Object> getVirtualEntityIds() {
		return virtualEntityIds;
	}
	public void setVirtualEntityIds(ArrayList<Object> virtualEntityIds) {
		this.virtualEntityIds = virtualEntityIds;
	}
	public String getLicenseConnectionGroup() {
		return licenseConnectionGroup;
	}
	public void setLicenseConnectionGroup(String licenseConnectionGroup) {
		this.licenseConnectionGroup = licenseConnectionGroup;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public SpBrowserSso getSpBrowserSso() {
		return spBrowserSso;
	}
	public void setSpBrowserSso(SpBrowserSso spBrowserSso) {
		this.spBrowserSso = spBrowserSso;
	}
	public String getConnectionTargetType() {
		return connectionTargetType;
	}
	public void setConnectionTargetType(String connectionTargetType) {
		this.connectionTargetType = connectionTargetType;
	}
	public RootConnection(String type, String id, String name, String entityId, boolean active, ContactInfo contactInfo,
			String loggingMode, ArrayList<Object> virtualEntityIds, String licenseConnectionGroup,
			Credentials credentials, SpBrowserSso spBrowserSso, String connectionTargetType) {
		super();
		this.type = type;
		this.id = id;
		this.name = name;
		this.entityId = entityId;
		this.active = active;
		this.contactInfo = contactInfo;
		this.loggingMode = loggingMode;
		this.virtualEntityIds = virtualEntityIds;
		this.licenseConnectionGroup = licenseConnectionGroup;
		this.credentials = credentials;
		this.spBrowserSso = spBrowserSso;
		this.connectionTargetType = connectionTargetType;
	}
	public RootConnection() {
		super();
	}
	@Override
	public String toString() {
		return "RootConnection [type=" + type + ", id=" + id + ", name=" + name + ", entityId=" + entityId + ", active="
				+ active + ", contactInfo=" + contactInfo + ", loggingMode=" + loggingMode + ", virtualEntityIds="
				+ virtualEntityIds + ", licenseConnectionGroup=" + licenseConnectionGroup + ", credentials="
				+ credentials + ", spBrowserSso=" + spBrowserSso + ", connectionTargetType=" + connectionTargetType
				+ "]";
	}
    
    
}
