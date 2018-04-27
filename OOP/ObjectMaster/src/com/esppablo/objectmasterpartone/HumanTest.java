package com.esppablo.objectmasterpartone;

public class HumanTest {

	public static void main(String[] args) {
		Human test1 = new Human();
		Human test2 = new Human();
		
		System.out.println("Display Health Human 1: " + test1.health);
		System.out.println("Display Health Human 2: " + test2.health);
		
		System.out.println("\nFight!!!\n");
		test1.attack(test2);
		test2.attack(test1);
		test2.attack(test1);
		test1.attack(test2);
		test2.attack(test1);

		
		System.out.println("Display Health Human 1: " + test1.health);
		System.out.println("Display Health Human 2: " + test2.health);
	}

}
