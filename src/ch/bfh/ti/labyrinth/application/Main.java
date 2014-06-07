package ch.bfh.ti.labyrinth.application;
	
import java.io.IOException;

import ch.bfh.ti.labyrinth.Solver.Solver;
import ch.bfh.ti.labyrinth.Creator.LabyrinthModel;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		LabyrinthModel l = new LabyrinthModel(10,10);
		
		Solver solver = new Solver(8, 9); // define Startpoint here
		
		launch(args);
	}
}