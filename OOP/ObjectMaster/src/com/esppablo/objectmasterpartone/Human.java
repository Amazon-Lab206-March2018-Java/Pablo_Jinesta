package com.esppablo.objectmasterpartone;

// Create a Human class

public class Human {
	
	// Add the strength, stealth, and intelligence attributes with a default of 3
	public int strength;
	public int stealth;
	public int intelligence;
	public int health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		// Add the health attribute with a default of 100
		health = 100;
	}
	
	// Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.
	public void attack(Human human) {
		human.health -= this.strength;
	}
	
}
