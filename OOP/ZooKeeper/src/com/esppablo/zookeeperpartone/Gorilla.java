package com.esppablo.zookeeperpartone;

public class Gorilla extends Mammal{

	// Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
	
	public void throwSomething() {
		// Have it print out a message indicating that the gorilla has thrown something
		// Decrease the energy level by 5
		System.out.println("Gorilla has thrown something!");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		// Have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
		System.out.println("Gorilla ate a banana!");
		energyLevel += 10;
		
	}
	
	public void climb() {
		// Have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
		System.out.println("Gorilla has climbed a tree!");
		energyLevel -= 10;
	}
}
