package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.StartGame;

public class ControllerGamesettings {
	@FXML
    void gameStart(ActionEvent event) {
		StartGame.startGame();
		System.out.println("Started");
	}
}
