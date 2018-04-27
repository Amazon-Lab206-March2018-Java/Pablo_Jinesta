package com.esppablo.zookeeperparttwo;

public class DragonTest {

	public static void main(String[] args) {
		Dragon test = new Dragon();
		
		System.out.println("Dragon Monitor: ");
		test.displayEnergy();
		
		test.attackTown();
		test.attackTown();
		test.attackTown();
		test.displayEnergy();

		test.eatHumans();
		test.eatHumans();
		test.displayEnergy();

		test.fly();
		test.fly();
		test.displayEnergy();
	}

}
