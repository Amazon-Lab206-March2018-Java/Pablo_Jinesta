package com.esppablo.objectmasterparttwo;
import com.esppablo.objectmasterpartone.*;

public class SampleTest {

	public static void main(String[] args) {
		Human human1 = new Human();
		Ninja ninja1 = new Ninja();
		Wizard wizard1 = new Wizard();
		Samurai samurai2 = new Samurai();
		Samurai samurai1 = new Samurai();
		
		ninja1.steal(human1);
		wizard1.heal(human1);
		samurai1.deathBlow(wizard1);
		
		System.out.println("There are " + samurai1.howMany() + " Samurais");
		
		
	}

}
