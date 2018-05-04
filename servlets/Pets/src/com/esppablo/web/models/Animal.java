package com.esppablo.web.models;

// Create an animal model containing the name, breed, and weight fields.

public class Animal{
	private String name;
	private String breed;
	private int weight;
	
	public Animal(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	// getters and setters
	
	public String getName() {
		return name;
	}
    public void setName(String name) {
        this.name = name;
    }
	
	public String getBreed() {
		return breed;
	}
    public void setBreed(String breed) {
        this.breed = breed;
    }
	
	public int getWeight() {
		return weight;
	}
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
