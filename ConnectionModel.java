package com.ping.admin.api.connectionmodel;

public class ConnectionModel {
	private String connectionName;
	private String connectionId;
	private String connectionEntityId;
	private String connectionCertId;
	private String connectionACSUrl;
	private String policyContractId;
	public String getConnectionName() {
		return connectionName;
	}
	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}
	public String getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}
	public String getConnectionEntityId() {
		return connectionEntityId;
	}
	public void setConnectionEntityId(String connectionEntityId) {
		this.connectionEntityId = connectionEntityId;
	}
	public String getConnectionCertId() {
		return connectionCertId;
	}
	public void setConnectionCertId(String connectionCertId) {
		this.connectionCertId = connectionCertId;
	}
	public String getConnectionACSUrl() {
		return connectionACSUrl;
	}
	public void setConnectionACSUrl(String connectionACSUrl) {
		this.connectionACSUrl = connectionACSUrl;
	}
	public String getPolicyContractId() {
		return policyContractId;
	}
	public void setPolicyContractId(String policyContractId) {
		this.policyContractId = policyContractId;
	}
	public ConnectionModel(String connectionName, String connectionId, String connectionEntityId,
			String connectionCertId, String connectionACSUrl, String policyContractId) {
		super();
		this.connectionName = connectionName;
		this.connectionId = connectionId;
		this.connectionEntityId = connectionEntityId;
		this.connectionCertId = connectionCertId;
		this.connectionACSUrl = connectionACSUrl;
		this.policyContractId = policyContractId;
	}
	@Override
	public String toString() {
		return "ConnectionModel [connectionName=" + connectionName + ", connectionId=" + connectionId
				+ ", connectionEntityId=" + connectionEntityId + ", connectionCertId=" + connectionCertId
				+ ", connectionACSUrl=" + connectionACSUrl + ", policyContractId=" + policyContractId + "]";
	}
	
}
