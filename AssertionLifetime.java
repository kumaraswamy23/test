package com.ping.admin.api.connectionmodel;

import org.springframework.beans.factory.annotation.Value;

public class AssertionLifetime {
	public int minutesBefore;
    public int minutesAfter;
	public int getMinutesBefore() {
		return minutesBefore;
	}
	public void setMinutesBefore(int minutesBefore) {
		this.minutesBefore = minutesBefore;
	}
	public int getMinutesAfter() {
		return minutesAfter;
	}
	public void setMinutesAfter(int minutesAfter) {
		this.minutesAfter = minutesAfter;
	}
	public AssertionLifetime(int minutesBefore, int minutesAfter) {
		super();
		this.minutesBefore = minutesBefore;
		this.minutesAfter = minutesAfter;
	}
    
}
