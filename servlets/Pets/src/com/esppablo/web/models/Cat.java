package com.esppablo.web.models;

public class Cat extends Animal implements Pet {

	// model containing the name, breed, and weight fields
	public Cat (String name, String breed, int weight) {
		super (name, breed, weight);
	}

	@Override
	public String showAffection() {
		// TODO for all cats, have them look at you
		return "Your " + super.getBreed() + " cat, " + super.getName() + ", is staring at you...";
	}

}
