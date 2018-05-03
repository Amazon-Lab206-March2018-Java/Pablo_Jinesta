package com.esppablo.pokemon;

public class Pokemon {
	
	// name, health, and type member variables.
	
	private String name;
	private int health;
	private String type;
	
	// a count static variable that keeps the number of Pokemon created in the program
	private static int count = 0;
	
	// getters and setters for each member variable.
	public String getName() {
		return name;
	}
    public void setName(String name) {
        this.name = name;        
    }

	public int getHealth() {
		return health;
	}
    public void setHealth(int health) {
        this.health = health;        
    }
	
	public String getType() {
		return type;
	}
    public void setType(String type) {
        this.type = type;        
    }

	public static int getCount() {
		return count;
	}
	
	// a constructor class to set the instance's name, health, and type on creation
	public Pokemon(String name, int health, String type){
		this.name = name;
		this.health = health;
		this.type = type;
	}
}
