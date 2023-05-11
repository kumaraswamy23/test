package com.ping.admin.api.pcvmodel;

import java.util.ArrayList;

public class Row {
	public ArrayList<Object> fields;
    public boolean defaultRow;
	public ArrayList<Object> getFields() {
		return fields;
	}
	public void setFields(ArrayList<Object> fields) {
		this.fields = fields;
	}
	public boolean isDefaultRow() {
		return defaultRow;
	}
	public void setDefaultRow(boolean defaultRow) {
		this.defaultRow = defaultRow;
	}
	public Row(ArrayList<Object> fields2, boolean defaultRow) {
		super();
		this.fields = fields2;
		this.defaultRow = defaultRow;
	}
    
}
