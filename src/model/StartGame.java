package model;

import java.io.IOException;
import java.util.Random;

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
		createStack();
		if(Main.debugMode) {
			System.out.println("Cards before: " + GameVariables.cardStack.size());
		}
		mix();
		if(Main.debugMode) {
			System.out.println("After mix : " + GameVariables.cardStack.size());
			System.out.print("All Cards:");
			for(Card c : GameVariables.cardStack) {
				try {
					c.toString();
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		System.out.println("Mixed Cards:");
		for(Card c : GameVariables.cardStack) {
			System.out.println(c.toString());
		}
//		Main.loadScene(FXMLLoader.load(Main.class.getResource("game.fxml"))); 
//TODO mix()
	}
	
	private static void mix() {
		Card[] a = new Card[GameVariables.cardStack.size()];
		
		for(Card c : GameVariables.cardStack) {
			if(Main.debugMode) {
				System.out.println("Mixing: for");
			}
			if(c == null) {
				System.out.println("break");
				break;
			}
			Random r = new Random();
			int i = r.nextInt(GameVariables.cardStack.size())+1;
			while(true) {
				
				if(Main.debugMode) {
					System.out.println("while" + i);
					System.out.println("Want to mixed: " + c.toString());
				}
				if(i >= GameVariables.cardStack.size()) {
					i = 0;
				}
				if(a[i] == null) {
					a[i] = c;
					if(Main.debugMode) {
						System.out.println("Card mixed" + c.toString());
					}
					break;
				}else {
					i++;
				}
			}
			
		}
		GameVariables.cardStack.clear();
		for(int i = 0; i < a.length; i++) {
			GameVariables.cardStack.add(a[i]);
		}
	}
	
	private static void createStack() {
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