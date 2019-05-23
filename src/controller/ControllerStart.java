package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.StartGame;

public class ControllerStart {
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {
    	
    }
    
    @FXML
    void closeGameBtn(ActionEvent event) {
    	System.out.println("closeGameBtn");
    	
    }

    @FXML
    void gameSettingsBtn(ActionEvent event) {
    	System.out.println("gameSettingsBtn");
    	
    }

    @FXML
    void startGameBtn(ActionEvent event) {
    	System.out.println("startGameBtn");
    	StartGame.goToGameSettings();
    }
}
