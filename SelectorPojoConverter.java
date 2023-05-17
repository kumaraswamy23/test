package com.ping.admin.api.helper;

import java.util.ArrayList;

import com.ping.admin.api.policymodel.PolicyPayload;
import com.ping.admin.api.selectormodel.AttributeContract;
import com.ping.admin.api.selectormodel.Configuration;
import com.ping.admin.api.selectormodel.Field;
import com.ping.admin.api.selectormodel.PluginDescriptorRef;
import com.ping.admin.api.selectormodel.Root;
import com.ping.admin.api.selectormodel.Row;
import com.ping.admin.api.selectormodel.SelectorPayload;
import com.ping.admin.api.selectormodel.Table;


public class SelectorPojoConverter {

	public static String url = "https://localhost:9999/pf-admin-api/v1/";
	
	public static Root createRootPolicy(SelectorPayload payload) {
		//Field field = new Field("Connection",payload.getEntityId());
		PluginDescriptorRef pluginDescriptorRef = new PluginDescriptorRef("com.pingidentity.pf.selectors.connectionset.ConnectionSetAdapterSelector",url+"authenticationSelectors/descriptors/com.pingidentity.pf.selectors.connectionset.ConnectionSetAdapterSelector");
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.add(new Field("Connection",payload.getEntityId()));
		Row row = new Row(fields,false);
		ArrayList<Row> rows = new ArrayList<Row>();
		rows.add(row);
		//Table table = new Table("Connections",rows);
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table("Connections",rows));
		Configuration configuration = new Configuration(tables,new ArrayList<Field>());
		Root root = new Root(payload.getId(),payload.getName(),pluginDescriptorRef,configuration,new AttributeContract());
		return root;
	}
}
