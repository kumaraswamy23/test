package com.ping.admin.api.connectionmodel;

public class SsoServiceEndpoint {
	public String binding;
    public String url;
    public boolean isDefault;
    public int index;
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public SsoServiceEndpoint(String binding, String url, boolean isDefault, int index) {
		super();
		this.binding = binding;
		this.url = url;
		this.isDefault = isDefault;
		this.index = index;
	}
    
}
