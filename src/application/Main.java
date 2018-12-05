package application;
	
import java.awt.Button;
import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * 
 * @author Ovejo
 * @version 1.0
 * @see start
 *
 */
public class Main extends Application {
	Button button;
	Stage stage;

	@Override
	public void start(Stage myStage) throws Exception {

		stage = myStage;
		Button boton;
		MainWindow();

	}

	private void MainWindow() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("Jfoenix.fxml"));
			AnchorPane pane = loader.load();

			Scene scene = new Scene(pane);
			
			scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Dokdo");
			
			
	        
			Font.loadFont(getClass().getResourceAsStream("assets/Sacramento-Regular.ttf"), 20);

			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeStage() {
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
