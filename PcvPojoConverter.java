package com.ping.admin.api.helper;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ping.admin.api.pcvmodel.AttributeContract;
import com.ping.admin.api.pcvmodel.Configuration;
import com.ping.admin.api.pcvmodel.CoreAttribute;
import com.ping.admin.api.pcvmodel.EncryptedField;
import com.ping.admin.api.pcvmodel.ExtendedAttribute;
import com.ping.admin.api.pcvmodel.Field;
import com.ping.admin.api.pcvmodel.Payload;
import com.ping.admin.api.pcvmodel.PluginDescriptorRef;
import com.ping.admin.api.pcvmodel.RootPcv;
import com.ping.admin.api.pcvmodel.Row;
import com.ping.admin.api.pcvmodel.Table;

public class PcvPojoConverter {
	public static RootPcv createRootPcv(Payload payload) {
		PluginDescriptorRef psluginDescriptorRef = new PluginDescriptorRef("com.pingidentity.plugins.pcvs.pingid.PingIdPCV","https://l1dvap1076.1dc.com:9998/pf-admin-api/v1/passwordCredentialValidators/descriptors/com.pingidentity.plugins.pcvs.pingid.PingIdPCV");
		
		
		
		/*Field field = new Field("Client IP","10.180.144.167");
		EncryptedField fieldClient = new EncryptedField("Client Shared Secret","OBF:JWE:eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoibFZxblJrdVE0WSIsInZlcnNpb24iOiIxMS4yLjMuMCJ9..qreXLFA2KblfErPQyXBbGQ.ReSwvGomTn4xv-YVE-JDAw.ddzkT_d_cYZbBe0zU7NJ9Q");
		Field fieldLabel = new Field("Label","");
		
		ArrayList<Object> fields = new ArrayList<Object>();
		fields.add(field);
		fields.add(fieldClient);
		fields.add(fieldLabel);
		
		ArrayList<Object> fields1 = new ArrayList<Object>();
		fields1.add(new Field("Client IP","10.180.144.168"));
		fields1.add(fieldClient);
		fields1.add(fieldLabel);
		
		ArrayList<Object> fields2 = new ArrayList<Object>();
		fields2.add(new Field("Client IP","10.180.144.169"));
		fields2.add(fieldClient);
		fields2.add(fieldLabel);
		
		Row row = new Row(fields,false);
		Row row1 = new Row(fields1,false);
		Row row2 = new Row(fields2,false);
		ArrayList<Row> rows = new ArrayList<Row>();
		rows.add(row);
		rows.add(row1);
		rows.add(row2);*/
		
		List<String> ipList = Arrays.asList("10.180.144.167","10.180.144.168","10.180.144.169","10.180.144.170","10.180.144.171","10.180.144.172","10.180.144.173","10.180.144.174","10.180.144.175","10.180.145.177","10.174.144.248","10.35.163.91","10.35.163.92","10.35.163.93","10.131.70.30","10.131.70.31","11.35.163.91","11.35.163.92","11.35.163.93","11.131.70.30","11.131.70.31");
		ArrayList<Row> rowsData = arrayRow(ipList);
		ArrayList<Row> emptyData = new ArrayList<Row>();
		
		Table table = new Table("RADIUS Clients",rowsData);
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(table);
		tables.add(new Table("Delegate PCV's",emptyData));
		tables.add(new Table("Member Of Groups",emptyData));
		tables.add(new Table("Bypass Member Of Groups",emptyData));
		tables.add(new Table("RADIUS Vendor-Specific attributes",emptyData));
		tables.add(new Table("Multiple attributes mapping rules",emptyData));
		tables.add(new Table("User specific groups to Radius Client",emptyData));
		
		//Field fieldCheck = new Field("CHECK GROUPS","false");
		//Field fieldBypass = new Field("CHECK BYPASS GROUPS","false");
		//ArrayList<Field> fieldList = new ArrayList<Field>();
		//fieldList.add(new Field("CHECK GROUPS","false"));
		//fieldList.add(new Field("CHECK BYPASS GROUPS","false"));
		ArrayList<Object> fieldList = arrayField(payload.getLdapId(),payload.getLdapSearch());
		Configuration configuration = new Configuration(tables,fieldList);
		
		ArrayList<CoreAttribute> coreAttributes = new ArrayList<CoreAttribute>();
		coreAttributes.add(new CoreAttribute("username"));
		ArrayList<ExtendedAttribute> extendedAttributes = new ArrayList<ExtendedAttribute>();
		extendedAttributes.add(new ExtendedAttribute("mail"));
		extendedAttributes.add(new ExtendedAttribute("givenName"));
		extendedAttributes.add(new ExtendedAttribute("isMemberOf"));
		extendedAttributes.add(new ExtendedAttribute("sn"));
		
		AttributeContract attributeContract = new AttributeContract(coreAttributes,extendedAttributes);
		
		RootPcv rootPcv = new RootPcv(payload.getId(),payload.getName(),psluginDescriptorRef,configuration,attributeContract);
		return rootPcv;
	}
	
	public static ArrayList<Row> arrayRow(List<String> ipList) {
		//ArrayList<Object> fields = new ArrayList<Object>();
		ArrayList<Row> rows = new ArrayList<Row>();
		Row row = null;
		ipList.forEach(name-> {
			ArrayList<Object> fields = new ArrayList<Object>();
			fields.add(new Field("Client IP",name));
			fields.add(new EncryptedField("Client Shared Secret","OBF:JWE:eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoibFZxblJrdVE0WSIsInZlcnNpb24iOiIxMS4yLjMuMCJ9..qreXLFA2KblfErPQyXBbGQ.ReSwvGomTn4xv-YVE-JDAw.ddzkT_d_cYZbBe0zU7NJ9Q"));
			fields.add(new Field("Label",""));
			//row = new Row(fields,false);
			rows.add(new Row(fields,false));
		});
		return rows;
	}
	
	public static ArrayList<Object> arrayField(String ldapId,String ldapSearch) {
		ArrayList<Object> fieldList = new ArrayList<Object>();
		fieldList.add(new Field("CHECK GROUPS","false"));
		fieldList.add(new Field("CHECK BYPASS GROUPS","false"));
		
		fieldList.add(new Field("IF THE USER IS NOT ACTIVATED ON PINGID","register"));
		fieldList.add(new Field("FAIL Login if the user is not member of the ldap group","true"));
		fieldList.add(new Field("Enable RADIUS Remote Network Policy Server","false"));
		fieldList.add(new Field("RADIUS Network Policy Server IP",""));
		fieldList.add(new Field("RADIUS Network Policy Server Port",""));
		fieldList.add(new Field("RADIUS Server Authentication Port","1812"));
		fieldList.add(new Field("Domain postfix",""));
		fieldList.add(new Field("PingID Properties File","#Auto-Generated from PingOne, downloaded by id=[888670] email=[DL-NA-PingOne-FDC-SDK-Dev@firstdata.com]\\n#Thu Aug 06 19:09:14 MDT 2020\\nuse_base64_key=/X58S4WZM2eDwJnGgw0Il2KIS0jWwJ21O7mR7DXU9RE=\\nuse_signature=true\\ntoken=8b4dc7f058034587a74b995499ce707a\\nidp_url=https://idpxnyl3m.pingidentity.com/pingid\\norg_alias=7a6192b0-174c-4d32-8a6c-de210d6ce5cf\\nadmin_url=https://idpxnyl3m.pingidentity.com/pingid\\nauthenticator_url=https://authenticator.pingone.com/pingid/ppm"));
		fieldList.add(new Field("Authentication During Errors","Block User"));
		fieldList.add(new Field("Users Without a Paired Device","Block User"));
		fieldList.add(new Field("LDAP Data source",""));
		fieldList.add(new Field("Create Entry For Devices","false"));
		fieldList.add(new Field("Encryption Key For Devices",""));
		fieldList.add(new Field("Search Base",ldapSearch));
		fieldList.add(new Field("Search Filter","sAMAccountName=${username}"));
		fieldList.add(new Field("Scope of Search","Subtree"));
		fieldList.add(new Field("Distinguished Name Pattern",""));
		fieldList.add(new Field("State Attribute",""));
		fieldList.add(new Field("Server Threads",""));
		fieldList.add(new Field("Enable RADIUS Server","true"));
		fieldList.add(new Field("Default Shared Secret",""));
		
		fieldList.add(new Field("PingID service ID","vpn"));
		fieldList.add(new Field("Application name","VPN"));
		fieldList.add(new Field("Application icon",""));
		fieldList.add(new EncryptedField("State Encryption Key","OBF:JWE:eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjoibFZxblJrdVE0WSIsInZlcnNpb24iOiIxMS4yLjMuMCJ9..7VI8ZaoFwUlFd9as7Omn6Q.rb2msqMzD1sQprpfWlBbGVuDZhQ_6-f1MzjJiTOCcMfxiciqFeM7VxRFVAq3SopB.KcKugSLBqJAYOaZO0tmeAQ"));
		fieldList.add(new Field("State Lifetime","600"));
		fieldList.add(new Field("RADIUS client doesn't support challenge","true"));
		fieldList.add(new Field("OTP in password separator","Comma"));
		fieldList.add(new Field("RADIUS client password validation","true"));
		fieldList.add(new Field("PingID username attribute","sAMAccountName"));
		fieldList.add(new Field("PingId Heartbeat Timeout","90"));
		fieldList.add(new Field("Newline Character","None"));
		
		return fieldList;
	}
}
