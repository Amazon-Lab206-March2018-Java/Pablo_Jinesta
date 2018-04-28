package com.esppablo.objectmasterparttwo;
import com.esppablo.objectmasterpartone.*;

public class Samurai extends Human {
	// Number of Samurais
	public static int samurais = 0;

	// Samurai: Set a default health of 200
	public Samurai() {
		health = 200;
		samurais++;
	}
	
	// Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
	public void deathBlow(Human human) {
		// decreases human health to 0
		human.health = 0;
		// but also halves the Samurai's health
		this.health /= 2;
	}
	
	// Samurai: Add a method meditate() that heals the Samurai for half of their current health.
	public void meditate() {
		health += health/2;
	}
	
	// Samurai: Add a method howMany() that returns the total current number of Samurai.
	public int howMany() {
		return samurais;
	}
}
