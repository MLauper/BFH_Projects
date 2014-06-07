package ch.bfh.ti.labyrinth.application;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ResourceBundle;

import ch.bfh.ti.labyrinth.Creator.LabyrinthModel;
import ch.bfh.ti.labyrinth.Solver.Solver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txfX;

    @FXML
    private MenuItem menuGenerate;

    @FXML
    private TextField txfY;

    @FXML
    private Label lblMessage;

    @FXML
    private Button btnSolve;

    @FXML
    private Canvas cvsCanvas;

    @FXML
    private VBox root;

    @FXML
    private MenuItem menuClose;

    @FXML
    private MenuItem menuLoad;

    @FXML
    void mazeGenerate(ActionEvent event) throws FileNotFoundException, UnsupportedEncodingException {
		LabyrinthModel l = new LabyrinthModel(10,10);
    }

    @FXML
    void mazeLoad(ActionEvent event) {

    }

    @FXML
    void mazeClose(ActionEvent event) {

    }
    
    @FXML
    void mazeSolve(ActionEvent event) throws FileNotFoundException {
    	Solver solver = new Solver(8, 9); // define Startpoint here
    }

    @FXML
    void initialize() {
        assert txfX != null : "fx:id=\"txfX\" was not injected: check your FXML file 'Main.fxml'.";
        assert menuGenerate != null : "fx:id=\"menuGenerate\" was not injected: check your FXML file 'Main.fxml'.";
        assert txfY != null : "fx:id=\"txfY\" was not injected: check your FXML file 'Main.fxml'.";
        assert lblMessage != null : "fx:id=\"lblMessage\" was not injected: check your FXML file 'Main.fxml'.";
        assert btnSolve != null : "fx:id=\"btnSolve\" was not injected: check your FXML file 'Main.fxml'.";
        assert cvsCanvas != null : "fx:id=\"cvsCanvas\" was not injected: check your FXML file 'Main.fxml'.";
        assert root != null : "fx:id=\"root\" was not injected: check your FXML file 'Main.fxml'.";
        assert menuClose != null : "fx:id=\"menuClose\" was not injected: check your FXML file 'Main.fxml'.";
        assert menuLoad != null : "fx:id=\"menuLoad\" was not injected: check your FXML file 'Main.fxml'.";

    }
}