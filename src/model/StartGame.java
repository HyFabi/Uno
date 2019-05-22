package model;

import view.Main;

public class StartGame {
	
	public StartGame() {
		summonCards(Colors.YELLOW);
		summonCards(Colors.BLUE);
		summonCards(Colors.RED);
		summonCards(Colors.GREEN);
		spezialCards();
		if(Main.debugMode) {
			System.out.println("Cards Created");
		}
	}
	
	public void summonCards(Colors c) {
		for(int i = 0; i < 13; i++) {
			GameVariables.cards.add(new Card(c, i));
		}
	}
	
	public void spezialCards() {
		for(int y = 0; y < 4; y++){
			for(int i = 13; i < 15; i++) {
				GameVariables.cards.add(new Card(Colors.BLACK, i));
			}
		}
	}
}
