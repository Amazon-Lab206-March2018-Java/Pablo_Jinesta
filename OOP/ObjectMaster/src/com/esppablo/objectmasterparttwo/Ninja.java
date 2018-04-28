package com.esppablo.objectmasterparttwo;
import com.esppablo.objectmasterpartone.*;

public class Ninja extends Human{

	// Ninja: Set default stealth to 10
	public Ninja() {
		stealth  = 10;
	}
	
	// Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
	public void steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
	}

	// Ninja: Add a method runAway() that decreases their health by 10
	public void runAway() {
		health -= 10;
	}
}
