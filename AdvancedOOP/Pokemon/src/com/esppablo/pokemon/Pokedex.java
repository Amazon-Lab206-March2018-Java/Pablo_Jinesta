package com.esppablo.pokemon;

// Create a Pokedex class that extends the abstract class above and implements pokemonInfo(Pokemon pokemon).

public class Pokedex extends AbstractPokemon{
	
	// pokemonInfo(Pokemon pokemon): This method returns a String with the name, health, and type of the pokemon
	public String pokemonInfo(Pokemon pokemonInfo) {
		return "Name: " + pokemonInfo.getName() + "\nHealth: " + pokemonInfo.getHealth() + "\nType: " + pokemonInfo.getType();
	}

}
