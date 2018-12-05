package application;

import java.awt.Button;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controler {
	private AnchorPane mypane1;
	
	@FXML 
	private javafx.scene.control.Button closeButton;

	@FXML
	private void handleClose(){
	    Stage stage = (Stage) closeButton.getScene().getWindow();
	    stage.close();
	}
	@FXML
	private void changed() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Jfoenix2.fxml"));
		// loader.setController(new SetBlur()); 
		mypane1 = (AnchorPane) loader.load();
		// TODO Auto-generated catch block
		Stage SecondStage = new Stage();
		SecondStage.setScene(new Scene(mypane1));
		SecondStage.initStyle(StageStyle.UNDECORATED);
		SecondStage.show();
	}
}
