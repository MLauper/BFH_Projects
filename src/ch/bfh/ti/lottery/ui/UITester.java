package ch.bfh.ti.lottery.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UITester extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
            FXMLLoader loader = new FXMLLoader(
            UITester.class.getResource("ComplexApplication_i18n.fxml"));
            VBox rootLayout = (VBox) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
	}

	public static void main(String[] args) {
		launch(args);
	}
}
