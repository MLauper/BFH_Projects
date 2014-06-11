package ch.bfh.ti.lottery.ui;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UiMain extends Application {

	private static Locale locale = new Locale("de", "CH");
	private static ResourceBundle resources;
 
	@Override
	public void start(Stage primaryStage) {
		FileInputStream fstream;
		try {
			fstream = new FileInputStream("lang.config");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			ArrayList<String> strings = new ArrayList<String>();
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				strings.add(strLine);
			}
			// Close the input stream
			in.close();
			locale = new Locale(strings.get(0), strings.get(1));
		} catch (FileNotFoundException e1) {
			//DO Nothing
		} catch (IOException e) {
			// Do Nothing
		}

		try {
			resources = ResourceBundle.getBundle(
					"ch.bfh.ti.lottery.ui.resources.langFile", locale);
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass()
					.getResource("UILottery.fxml"), resources);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
		    primaryStage.setResizable(false);
			primaryStage.setTitle("Lottery");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
