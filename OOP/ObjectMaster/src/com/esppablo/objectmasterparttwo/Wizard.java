package com.esppablo.objectmasterparttwo;
import com.esppablo.objectmasterpartone.*;

// Create Ninja class that extends from the Human class.

public class Wizard extends Human {
	
	// Wizard: Set default health to 50
	// Wizard: Set default intelligence to 8
	
	public Wizard() {
		health = 50;
		intelligence = 8;
	}
	
	// Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence
	public void heal(Human human) {
		human.health += this.intelligence;
	}
	
	// Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
	public void fireball(Human human) {
		human.health -= this.intelligence * 3;
	}

}
