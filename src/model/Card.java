package model;

import view.Main;

public class Card {
	
	private Colors color;
	private int number;
	
	
	// 10 = +2; 11 = Auslassen; 12 = Richtungswechsel; 13 =+4; 14 = Farbe aussuchen

	public Card(Colors c, int n) {
		setColor(c);
		setNumber(n);
		if(Main.debugMode) {
			System.out.println("Card initialized");
		}
	}
	
	public Colors getColor() {
		return color;
	}
	
	public void setColor(Colors color) {
		this.color = color;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		if(number >= 0 && number < 15){
			this.number = number;
		}
	}
}
