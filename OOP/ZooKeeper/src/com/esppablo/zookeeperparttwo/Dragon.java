package com.esppablo.zookeeperparttwo;
import com.esppablo.zookeeperpartone.*;

public class Dragon extends Mammal{
	// Create a Dragon class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
	public Dragon() {
		energyLevel = 300;
	}
	
	public void fly() {
		// For the fly() method, print the sound a dragon taking off and decrease its energy by 50.
		System.out.println("(Sound) Dragon taking off...");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		// For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
		System.out.println("Dragon ate a human!");
		energyLevel += 25;
	}
	
	public void attackTown() {
		// For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
		System.out.println("(Sound) Town on fire...");
		energyLevel -= 100;
	}
	
}
