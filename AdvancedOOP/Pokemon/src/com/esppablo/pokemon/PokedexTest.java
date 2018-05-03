package com.esppablo.pokemon;

public class PokedexTest {

	public static void main(String[] args) {
		// Pokedex tell us information about Pokemon characters:
		Pokedex newPokedex = new Pokedex();
		
		// Crearte megatron
		Pokemon megatron = newPokedex.createPokemon("Megatrun", 100, "Deceptimon");
		// Action: Atack megatron
		newPokedex.attackPokemon(megatron);
		// Display Info megatron
		System.out.println(newPokedex.pokemonInfo(megatron));
		
	}

}
