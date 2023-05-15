package com.ping.admin.api.adaptermodel;

import java.util.ArrayList;

public class Row{
    public ArrayList<Field> fields;
    public boolean defaultRow;
	public ArrayList<Field> getFields() {
		return fields;
	}
	public void setFields(ArrayList<Field> fields) {
		this.fields = fields;
	}
	public boolean isDefaultRow() {
		return defaultRow;
	}
	public void setDefaultRow(boolean defaultRow) {
		this.defaultRow = defaultRow;
	}
	public Row(ArrayList<Field> fields, boolean defaultRow) {
		super();
		this.fields = fields;
		this.defaultRow = defaultRow;
	}
	public Row() {
		super();
	}
    
    
}
