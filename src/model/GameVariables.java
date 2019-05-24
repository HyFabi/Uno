package model;

import java.util.ArrayList;

public class GameVariables {
	
	public static int players;
	public static int startCount;
	public static ArrayList<Card> cardStack = new ArrayList<Card>();
	public static ArrayList<ArrayList<Card>> npcs = new ArrayList<>();
	
	public GameVariables(int players) {
		setPlayers(players);
	}
	
	public void setPlayers(int players) {
		if(players > 1 && players <= 4) {
			GameVariables.players = players;
		}else {
			GameVariables.players = 4;
		}
	}
	
	public int getPlayers() {
		return players;
	}

	public static void setStardCount(int startCount) {
		if(startCount > 2 && startCount <= 14) {
			GameVariables.startCount = startCount;
		}else {
			GameVariables.startCount = 7;
		}
		
	}
}