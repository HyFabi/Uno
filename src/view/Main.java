package view;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	public static final boolean debugMode = true;
	public static Parent root;
	
	static Stage primaryStage = new Stage();
	static Scene scene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = FXMLLoader.load(getClass().getResource("startMenu.fxml"));
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void loadScene(Parent p) {
		scene = null;
		scene = new Scene(p);
		Main.primaryStage.setScene(scene);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}