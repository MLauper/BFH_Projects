package ch.bfh.ti.quizduel.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by alain on 26.04.14.
 */
public class UI_StartController implements Initializable, ControlledScreen {

    ScreensController myController;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


    @FXML
    private void gotoCreatePlayer(ActionEvent event) {
        myController.setScreen(StartGame.screenCreatePlayerID);
    }

    @FXML
    private void gotoPlayerList(ActionEvent event) {
        myController.setScreen(StartGame.screenPlayerListID);

    }

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
}