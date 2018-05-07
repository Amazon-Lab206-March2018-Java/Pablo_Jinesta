package com.esppablo.web.models;

// Create a Player JavaBean as a model with a first_name, last_name, and age.

public class Player {

	private String first_name;
	private String last_name;
	private int age;
	
	public Player(String firstname, String lastname, int age) {
		first_name = firstname;
		last_name = lastname;
		this.age = age;
	}
	
	// getters and setters
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
