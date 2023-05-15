package com.ping.admin.api.helper;

import java.util.ArrayList;

import com.ping.admin.api.adaptermodel.AdapterPayload;
import com.ping.admin.api.adaptermodel.AttributeContract;
import com.ping.admin.api.adaptermodel.AttributeContractFulfillment;
import com.ping.admin.api.adaptermodel.AttributeMapping;
import com.ping.admin.api.adaptermodel.Configuration;
import com.ping.admin.api.adaptermodel.CoreAttribute;
import com.ping.admin.api.adaptermodel.DisplayName;
import com.ping.admin.api.adaptermodel.ExtendedAttribute;
import com.ping.admin.api.adaptermodel.Field;
import com.ping.admin.api.adaptermodel.IssuanceCriteria;
import com.ping.admin.api.adaptermodel.Mail;
import com.ping.admin.api.adaptermodel.PluginDescriptorRef;
import com.ping.admin.api.adaptermodel.PolicyAction;
import com.ping.admin.api.adaptermodel.Root;
import com.ping.admin.api.adaptermodel.Row;
import com.ping.admin.api.adaptermodel.Source;
import com.ping.admin.api.adaptermodel.Table;
import com.ping.admin.api.adaptermodel.Uid;
import com.ping.admin.api.adaptermodel.Username;

public class AdapterPojoConverter {

	public static Root createRoot(AdapterPayload payload) {
		
		PluginDescriptorRef pluginDescriptorRef = new PluginDescriptorRef("com.pingidentity.adapters.htmlform.idp.HtmlFormIdpAuthnAdapter","https://l1dvap1076.1dc.com:9999/pf-admin-api/v1/idp/adapters/descriptors/com.pingidentity.adapters.htmlform.idp.HtmlFormIdpAuthnAdapter");
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.add(new Field("Password Credential Validator Instance",payload.getPcvId()));
		ArrayList<Row> rows = new ArrayList<Row>();
		rows.add(new Row(fields,false));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table("Credential Validators",rows));
		ArrayList<Field> fieldsList = arrayFields();
		Configuration configuration = new Configuration(tables,fieldsList);
		
		ArrayList<CoreAttribute> coreAttributes = new ArrayList<CoreAttribute>();
		coreAttributes.add(new CoreAttribute("policy.action",false,false));	
		coreAttributes.add(new CoreAttribute("username",false,true));	
		
		//ExtendedAttribute extendedAttribute = new ExtendedAttribute("uid",false,false);
		ArrayList<ExtendedAttribute> extendedAttributes = new ArrayList<ExtendedAttribute>();
		extendedAttributes.add(new ExtendedAttribute("uid",false,false));
		extendedAttributes.add(new ExtendedAttribute("mail",false,false));
		extendedAttributes.add(new ExtendedAttribute("displayName",false,false));
		AttributeContract attributeContract = new AttributeContract(coreAttributes,extendedAttributes,false);	
		
		AttributeContractFulfillment attributeContractFulfillment = new AttributeContractFulfillment();
		attributeContractFulfillment.setDisplayName(new DisplayName(new Source("ADAPTER"), "displayName"));
		attributeContractFulfillment.setPolicyaction(new PolicyAction(new Source("ADAPTER"), "policy.action"));
		attributeContractFulfillment.setMail(new Mail(new Source("ADAPTER"), "mail"));
		attributeContractFulfillment.setUid(new Uid(new Source("ADAPTER"), "uid"));
		attributeContractFulfillment.setUsername(new Username(new Source("ADAPTER"), "username"));
		
		IssuanceCriteria issuanceCriteria = new IssuanceCriteria();
		issuanceCriteria.setConditionalCriteria(new ArrayList<Object>());
		
		AttributeMapping attributeMapping = new AttributeMapping(new ArrayList<Object>(),attributeContractFulfillment,issuanceCriteria);
		
		Root root = new Root(payload.getId(),payload.getName(),pluginDescriptorRef,configuration,attributeContract,attributeMapping);
		
		
		return root;
	}
	
	public static ArrayList<Field> arrayFields() {
		ArrayList<Field> fieldsList = new ArrayList<Field>();
		fieldsList.add(new Field("Challenge Retries","5"));
		
		fieldsList.add(new Field("Session State","None"));
		fieldsList.add(new Field("Session Timeout","60"));
		fieldsList.add(new Field("Session Max Timeout","480"));
		fieldsList.add(new Field("Allow Password Changes","true"));
		fieldsList.add(new Field("Password Management System",""));
		fieldsList.add(new Field("Enable 'Remember My Username'","false"));
		fieldsList.add(new Field("Enable 'This is My Device'","false"));
		fieldsList.add(new Field("Change Password Email Notification","false"));
		fieldsList.add(new Field("Show Password Expiring Warning","false"));
		fieldsList.add(new Field("Password Reset Type","NONE"));
		fieldsList.add(new Field("Password Reset Policy Contract",""));
		fieldsList.add(new Field("Account Unlock","false"));
		fieldsList.add(new Field("Local Identity Profile",""));
		fieldsList.add(new Field("Notification Publisher",""));
		fieldsList.add(new Field("Enable Username Recovery","false"));
		fieldsList.add(new Field("Change Password Policy Contract",""));
		fieldsList.add(new Field("Revoke Sessions After Password Change Or Reset","false"));
		fieldsList.add(new Field("Login Template","html.form.login.template.html"));
		fieldsList.add(new Field("Logout Path",""));
		fieldsList.add(new Field("Logout Redirect",""));
		fieldsList.add(new Field("Logout Template","idp.logout.success.page.template.html"));
		fieldsList.add(new Field("Change Password Template","html.form.change.password.template.html"));
		fieldsList.add(new Field("Change Password Message Template","html.form.message.template.html"));
		fieldsList.add(new Field("Password Management System Message Template","html.form.message.template.html"));
		fieldsList.add(new Field("Change Password Email Template","message-template-end-user-password-change.html"));
		fieldsList.add(new Field("Expiring Password Warning Template","html.form.password.expiring.notification.template.html"));
		fieldsList.add(new Field("Threshold for Expiring Password Warning","7"));
		fieldsList.add(new Field("Snooze Interval for Expiring Password Warning","24"));
		fieldsList.add(new Field("Login Challenge Template","html.form.login.challenge.template.html"));
		fieldsList.add(new Field("'Remember My Username' Lifetime","30"));
		fieldsList.add(new Field("'This is My Device' Lifetime","30"));
		fieldsList.add(new Field("Allow Username Edits During Chaining","false"));
		fieldsList.add(new Field("Track Authentication Time","true"));
		fieldsList.add(new Field("Post-Password Change Re-Authentication Delay","0"));
		fieldsList.add(new Field("Password Reset Username Template","forgot-password.html"));
		fieldsList.add(new Field("Password Reset Code Template","forgot-password-resume.html"));
		fieldsList.add(new Field("Password Reset Template","forgot-password-change.html"));
		fieldsList.add(new Field("Password Reset Error Template","forgot-password-error.html"));
		fieldsList.add(new Field("Password Reset Success Template","forgot-password-success.html"));
		fieldsList.add(new Field("Account Unlock Template","account-unlock.html"));
		fieldsList.add(new Field("OTP Length","8"));
		fieldsList.add(new Field("OTP Time to Live","10"));
		fieldsList.add(new Field("PingID Properties",""));
		fieldsList.add(new Field("Require Verified Email","false"));
		fieldsList.add(new Field("Username Recovery Template","username.recovery.template.html"));
		fieldsList.add(new Field("Username Recovery Info Template","username.recovery.info.template.html"));
		fieldsList.add(new Field("Username Recovery Email Template","message-template-username-recovery.html"));
		fieldsList.add(new Field("CAPTCHA for Authentication","false"));
		fieldsList.add(new Field("CAPTCHA for Password change","false"));
		fieldsList.add(new Field("CAPTCHA for Password Reset","false"));
		fieldsList.add(new Field("CAPTCHA for Username recovery","false"));
		fieldsList.add(new Field("Password Update Timeout","30"));
		fieldsList.add(new Field("Require Re-Authentication For Expiring Password Flow","false"));
		fieldsList.add(new Field("Require Re-Authentication for Change Password Flow","true"));
		fieldsList.add(new Field("Require Re-Authentication for Password Reset Flow","true"));
		fieldsList.add(new Field("Password Reset One-Time Link Email Template","message-template-forgot-password-link.html"));
		fieldsList.add(new Field("Password Reset One-Time Password Email Template","message-template-forgot-password-code.html"));
		fieldsList.add(new Field("Password Reset Complete Email Template","message-template-forgot-password-complete.html"));
		fieldsList.add(new Field("Password Reset Failed Email Template","message-template-forgot-password-failed.html"));
		fieldsList.add(new Field("Account Unlock Email Template","message-template-account-unlock-complete.html"));
		fieldsList.add(new Field("Allowed OTP Character Set","23456789BCDFGHJKMNPQRSTVWXZbcdfghjkmnpqrstvwxz"));
		fieldsList.add(new Field("CAPTCHA Provider",""));
		fieldsList.add(new Field("Fail Authentication on Account Lockout","true"));
		return fieldsList;
	}
}
