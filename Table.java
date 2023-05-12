package com.ping.admin.api.pcvmodel;

import java.util.ArrayList;

public class Table {
	public String name;
    public ArrayList<Object> rows;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Object> getRows() {
		return rows;
	}
	public void setRows(ArrayList<Object> rows) {
		this.rows = rows;
	}
	public Table(String name, ArrayList<Object> rows) {
		super();
		this.name = name;
		this.rows = rows;
	}
	public Table() {
		super();
	}
    
    
}
