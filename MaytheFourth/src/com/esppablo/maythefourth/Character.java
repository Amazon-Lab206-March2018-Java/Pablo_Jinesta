package com.esppablo.maythefourth;

public class Character {
	private String name;
	private int weight;
	private String famous_saying;
	
	public Character (String name, int weight, String famous_saying) {
		this.name = name;
		this.weight = weight;
		this.famous_saying = famous_saying;
	}
	
	public Character () {
		this.name = "Character Name";
		this.weight = 0;
		this.famous_saying = "Famous Quote";
	}
	

	// getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getFamous_Saying() {
        return famous_saying;
    }
    public void setFamous_Saying(String famous_saying) {
        this.famous_saying = famous_saying;
    }
    
    public String introduction(Character characterName){
        return "Hello, " + characterName.getName() + ", I'm " + this.name ;
    }
}
