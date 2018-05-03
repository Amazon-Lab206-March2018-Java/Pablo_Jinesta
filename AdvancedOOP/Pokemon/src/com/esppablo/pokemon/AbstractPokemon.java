package com.esppablo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		// This method creates and returns Pokemon
		Pokemon pokemon = new Pokemon (name, health, type);
		return pokemon;
	}

	@Override
	public void attackPokemon (Pokemon attack) {
		// This method lowers the attacked Pokemon's health by 10 and returns void
		attack.setHealth(attack.getHealth()-10);
	}



}
