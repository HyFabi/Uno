package model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import view.Main;

public class StartGame {
	
	public static void goToGameSettings() {
		try {
			Main.loadScene(FXMLLoader.load(Main.class.getResource("settings.fxml")));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Fehler goToSettings()!");
		}
	}
	
	
	public static void startGame() {
		GameVariables.cardStack.clear();
		summonCards(Colors.YELLOW);
		summonCards(Colors.BLUE);
		summonCards(Colors.RED);
		summonCards(Colors.GREEN);
		spezialCards();
		if(Main.debugMode) {
			System.out.println("Cards Created");
		}
	}
	
	private static void summonCards(Colors c) {
		for(int i = 1; i < 13; i++) {
			GameVariables.cardStack.add(new Card(c, i));
		}
	}
	
	private static void spezialCards() {
		for(int y = 0; y < 4; y++){
			for(int i = 13; i < 15; i++) {
				GameVariables.cardStack.add(new Card(Colors.BLACK, i));
			}
		}
	}
}