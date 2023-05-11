package com.ping.admin.api.pcvmodel;

import java.util.ArrayList;

public class Configuration {
	public ArrayList<Table> tables;
    public ArrayList<Object> fields;
	public ArrayList<Table> getTables() {
		return tables;
	}
	public void setTables(ArrayList<Table> tables) {
		this.tables = tables;
	}
	public ArrayList<Object> getFields() {
		return fields;
	}
	public void setFields(ArrayList<Object> fields) {
		this.fields = fields;
	}
	public Configuration(ArrayList<Table> tables, ArrayList<Object> fields) {
		super();
		this.tables = tables;
		this.fields = fields;
	}
	public Configuration() {
		super();
	}
    
}
