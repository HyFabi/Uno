package model;

import java.util.ArrayList;

public class GameVariables {
	
	private int players;
	public static ArrayList<Card> cardStack = new ArrayList<>();
	public static ArrayList<ArrayList<Card>> npcs = new ArrayList<>();
	
	public GameVariables(int players) {
		setPlayers(players);
	}
	
	public void setPlayers(int players) {
		if(players > 1 && players <= 4) {
			this.players = players;
		}
	}
	
	public int getPlayers() {
		return players;
	}
}	