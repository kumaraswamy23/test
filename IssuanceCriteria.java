package com.ping.admin.api.policymodel;

import java.util.ArrayList;

public class IssuanceCriteria{
    public ArrayList<Object> conditionalCriteria;

	public ArrayList<Object> getConditionalCriteria() {
		return conditionalCriteria;
	}

	public void setConditionalCriteria(ArrayList<Object> conditionalCriteria) {
		this.conditionalCriteria = conditionalCriteria;
	}

	public IssuanceCriteria(ArrayList<Object> conditionalCriteria) {
		super();
		this.conditionalCriteria = conditionalCriteria;
	}

	public IssuanceCriteria() {
		super();
	}
    
    
}
