package com.esppablo.pokemon;

// Create an interface for the following methods:

public interface PokemonInterface {
	
	// createPokemon(String name, int health, String type): This method creates and returns Pokemon.
	Pokemon createPokemon(String name, int health, String type);
	
	// attackPokemon(Pokemon pokemon): This method lowers the attacked Pokemon's health by 10 and returns void
	void attackPokemon(Pokemon attack);
	
	// pokemonInfo(Pokemon pokemon): This method returns a String with the name, health, and type of the pokemon
	String pokemonInfo(Pokemon pokemonInfo);
	
}
