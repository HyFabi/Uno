package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import view.Main;

public class GameEngin {
	
	public void gamestart() {
		handOut();
		
	}
	
	public void paintCards() {
		for(Card c : Player.cards) {
			Image bi = new Image(Main.class.getResourceAsStream(c.path));
			ImageView i = new ImageView();
			i.setImage(bi);
		}
	}
	
	public void handOut() {
		int y = 0;
		for(int i = 0; i < GameVariables.players * GameVariables.startCount; i++) {
			if(y == GameVariables.players+1) {
				y = 0;
			}
			if(y == 0) {
				Player.cards.add(giveCard());
			}else {
				GameVariables.npcs.get(y-1).add(giveCard());
			}
			y++;
		}
	}
	
	public Card giveCard() {
		Card c = GameVariables.cardStack.get(0);
		GameVariables.cardStack.remove(0);
		if(Main.debugMode) {
			System.out.println("give Card: " + c.toString());
		}
		return c;
	}
}
