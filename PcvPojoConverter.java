package com.ping.admin.api.helper;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ping.admin.api.pcvmodel.AttributeContract;
import com.ping.admin.api.pcvmodel.Configuration;
import com.ping.admin.api.pcvmodel.CoreAttribute;
import com.ping.admin.api.pcvmodel.Field;
import com.ping.admin.api.pcvmodel.Payload;
import com.ping.admin.api.pcvmodel.PluginDescriptorRef;
import com.ping.admin.api.pcvmodel.RootPcv;
import com.ping.admin.api.pcvmodel.Table;



public class PcvPojoConverter {
	public static RootPcv createRootPcv(Payload payload) {
		PluginDescriptorRef pluginDescriptorRef = new PluginDescriptorRef("org.sourceid.saml20.domain.LDAPUsernamePasswordCredentialValidator","https://l1dvap1076.1dc.com:9998/pf-admin-api/v1/passwordCredentialValidators/descriptors/org.sourceid.saml20.domain.LDAPUsernamePasswordCredentialValidator");
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table("Authentication Error Overrides", new ArrayList<Object>()));
		ArrayList<Field> fields = arrayListField(payload.getLdapId(),payload.ldapSearch);
		Configuration configuration = new Configuration(tables,fields);
		ArrayList<CoreAttribute> coreAttributes = new ArrayList<CoreAttribute>();
		coreAttributes.add(new CoreAttribute("mail"));
		coreAttributes.add(new CoreAttribute("givenName"));
		coreAttributes.add(new CoreAttribute("DN"));
		coreAttributes.add(new CoreAttribute("username"));
		ArrayList<Object> extendedAttributes = new ArrayList<Object>();
		AttributeContract attributeContract = new AttributeContract(coreAttributes,extendedAttributes);
		RootPcv rootPcv = new RootPcv(payload.getId(),payload.getName(),pluginDescriptorRef,configuration,attributeContract);
		return rootPcv;
	}
	
	public static ArrayList<Field> arrayListField(String ldapId,String ldapSearch) {
		ArrayList<Field> fieldList = new ArrayList<Field>();
		fieldList.add(new Field("LDAP Datastore",ldapId));
		fieldList.add(new Field("Search Base",ldapSearch));
		fieldList.add(new Field("Search Filter","uid=${username}"));
		fieldList.add(new Field("Scope of Search","Subtree"));
		fieldList.add(new Field("Case-Sensitive Matching","true"));
		fieldList.add(new Field("Display Name Attribute","displayName"));
		fieldList.add(new Field("Mail Attribute","mail"));
		fieldList.add(new Field("SMS Attribute",""));
		fieldList.add(new Field("PingID Username Attribute",""));
		fieldList.add(new Field("Mail Search Filter",""));
		fieldList.add(new Field("Username Attribute",""));
		fieldList.add(new Field("Mail Verified Attribute",""));
		fieldList.add(new Field("Trim Username Spaces For Search","false"));
		fieldList.add(new Field("Enable PingDirectory Detailed Password Policy Requirement Messaging","false"));
		fieldList.add(new Field("Enable PingDirectory Detailed Password Policy Requirement Messaging","false"));
		return fieldList;
	}
	
	
	
	
}
