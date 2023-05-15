package com.ping.admin.api.adaptermodel;

import java.util.ArrayList;

public class Table{
    public String name;
    public ArrayList<Row> rows;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Row> getRows() {
		return rows;
	}
	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}
	public Table(String name, ArrayList<Row> rows) {
		super();
		this.name = name;
		this.rows = rows;
	}
	public Table() {
		super();
	}
    
    
}
