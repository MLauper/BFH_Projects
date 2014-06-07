package ch.bfh.ti.lottery.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UiMain extends Application {
	private AnchorPane rootLayout;
    private Scene scene;
	@Override
	public void start(Stage primaryStage) {
		try {
            FXMLLoader loader = new FXMLLoader(
                    UiMain.class.getResource("UILottery.fxml"));
            rootLayout = (AnchorPane) loader.load();
            scene = new Scene(rootLayout);
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
