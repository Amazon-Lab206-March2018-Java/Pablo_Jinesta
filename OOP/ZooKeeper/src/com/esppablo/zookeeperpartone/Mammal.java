package com.esppablo.zookeeperpartone;


public class Mammal {
	
	// Tasks:
	// Create a Mammal class that has an energyLevel and displayEnergy() method. 
	
	// Every mammal should have an energy level (default 100).
	public int energyLevel = 100;
	
	// The displayEnergy() method should show the animals energy level as well as return it.
	public int displayEnergy() {
		System.out.println("Gorilla Energy Levels are now at: " + energyLevel);
		return energyLevel;
	}
	
}
