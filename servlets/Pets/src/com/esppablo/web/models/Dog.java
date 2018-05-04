package com.esppablo.web.models;

public class Dog extends Animal implements Pet {
	
	// model containing the name, breed, and weight fields
	public Dog (String name, String breed, int weight) {
		super (name, breed, weight);
	}

	@Override
	public String showAffection() {
		// TODO different outputs depending on weight
		
		// For dogs < 30 lbs, have them hop into your lap!
		int lbs = super.getWeight();
		
		if (lbs < 30) {
			return "Your " + super.getBreed() + " dog " + super.getName() + " hopped into your lap and cuddled you...";
		}
		
		// For dogs >= 30 lbs, have them curl up next to you!
		else {
			return "Your " + super.getBreed() + " dog " + super.getName() + " curl up next to you...";
		}
		
	}

}
