package com.esppablo.web.models;

import java.util.ArrayList;

// Create a Team JavaBean as a model with a team_name and a list of players.

public class Team {
	
	private String teamName;
	private ArrayList<Player> players;
	
	public Team (String name) {
		teamName = name; 
		players = new ArrayList<>();
	}
	
	// getters and setters
	public String getTeamName(){
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public ArrayList<Player> getPlayers(){
		return players;
	}
	
	public int getTeamSize() {
		return players.size();
	}
	
	public Player getPlayer(int index) {
		return players.get(index);
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void removePlayer(int index) {
		players.remove(index);
	}
	

}
