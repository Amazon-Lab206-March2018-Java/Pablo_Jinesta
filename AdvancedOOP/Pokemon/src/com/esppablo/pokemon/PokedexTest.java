package com.esppablo.pokemon;

public class PokedexTest {

	public static void main(String[] args) {
		// Pokedex tell us information about Pokemon characters:
		Pokedex newPokedex = new Pokedex();
		
		// Crearte Megatrun
		Pokemon megatron = newPokedex.createPokemon("Megatrun", 100, "Deceptimon");
		// Action: Atack Megatrun
		newPokedex.attackPokemon(megatron);
		// Display Info Megatrun
		System.out.println(newPokedex.pokemonInfo(megatron));
		
	}

}
