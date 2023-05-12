package com.ping.admin.api.pcvmodel;

public class Payload {
	public String id;
	public String name;
	public String ldapId;
	public String ldapSearch;
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
	public String getLdapId() {
		return ldapId;
	}
	public void setLdapId(String ldapId) {
		this.ldapId = ldapId;
	}
	public String getLdapSearch() {
		return ldapSearch;
	}
	public void setLdapSearch(String ldapSearch) {
		this.ldapSearch = ldapSearch;
	}
	
}
