package com.ping.admin.api.policymodel;

public class Root{
    public RootNode rootNode;
    public String id;
    public String name;
    public boolean enabled;
    public AuthenticationApiApplicationRef authenticationApiApplicationRef;
    public boolean handleFailuresLocally;
	public RootNode getRootNode() {
		return rootNode;
	}
	public void setRootNode(RootNode rootNode) {
		this.rootNode = rootNode;
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
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public AuthenticationApiApplicationRef getAuthenticationApiApplicationRef() {
		return authenticationApiApplicationRef;
	}
	public void setAuthenticationApiApplicationRef(AuthenticationApiApplicationRef authenticationApiApplicationRef) {
		this.authenticationApiApplicationRef = authenticationApiApplicationRef;
	}
	public boolean isHandleFailuresLocally() {
		return handleFailuresLocally;
	}
	public void setHandleFailuresLocally(boolean handleFailuresLocally) {
		this.handleFailuresLocally = handleFailuresLocally;
	}
	public Root(RootNode rootNode, String id, String name, boolean enabled,
			AuthenticationApiApplicationRef authenticationApiApplicationRef, boolean handleFailuresLocally) {
		super();
		this.rootNode = rootNode;
		this.id = id;
		this.name = name;
		this.enabled = enabled;
		this.authenticationApiApplicationRef = authenticationApiApplicationRef;
		this.handleFailuresLocally = handleFailuresLocally;
	}
	public Root() {
		super();
	}
    
    
}
