package model;

import view.Main;

public class Card {
	
	private Colors color;
	private int number;
	
	
	// 11 = +2; 12 = Auslassen; 13 = Richtungswechsel; 14 =+4; 15 = Farbe aussuchen

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
		if(number > 0 && number < 16){
			this.number = number;
		}
	}
}
