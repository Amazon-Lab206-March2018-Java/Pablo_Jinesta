package com.esppablo.zookeeperpartone;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla test = new Gorilla();
				
		System.out.println("Gorilla Monitor: ");
		test.throwSomething();
		test.displayEnergy();

		test.throwSomething();
		test.displayEnergy();
		
		test.eatBananas();
		test.displayEnergy();

		test.throwSomething();
		test.displayEnergy();
	
		test.eatBananas();
		test.displayEnergy();

		test.climb();
		test.displayEnergy();

		
	}

}
