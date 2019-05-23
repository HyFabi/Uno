package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.StartGame;

public class ControllerGamesettings {
	@FXML
    void gameStart(ActionEvent event) throws IOException {
		StartGame.startGame();
		System.out.println("Started");
	}
}
