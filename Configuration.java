package com.ping.admin.api.selectormodel;

import java.util.ArrayList;

public class Configuration{
    public ArrayList<Table> tables;
    public ArrayList<Field> fields;
	public ArrayList<Table> getTables() {
		return tables;
	}
	public void setTables(ArrayList<Table> tables) {
		this.tables = tables;
	}
	public ArrayList<Field> getFields() {
		return fields;
	}
	public void setFields(ArrayList<Field> fields) {
		this.fields = fields;
	}
	public Configuration(ArrayList<Table> tables, ArrayList<Field> fields) {
		super();
		this.tables = tables;
		this.fields = fields;
	}
	public Configuration() {
		super();
	}
    
    
}
