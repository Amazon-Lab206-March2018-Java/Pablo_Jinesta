package com.esppablo.web.models;

public class Count {
	private int count;
	
	public Count() {
	}
	
	public Count(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String message() {
		return "You have clicked this button" + count + "times";
			
	}
}
