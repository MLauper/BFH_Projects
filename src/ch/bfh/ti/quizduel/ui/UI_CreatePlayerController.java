package ch.bfh.ti.quizduel.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by alain on 26.04.14.
 */
public class UI_CreatePlayerController implements Initializable, ControlledScreen {

    ScreensController myController;

    @FXML
    private TextField txtNewPlayerName;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    void doAddNewPlayer(ActionEvent event) {
        //bla.addPlayer(txtNewPlayerName.getText());
        txtNewPlayerName.setText("");
    }

    @FXML
    private void gotoStartPage(ActionEvent event) {
        myController.setScreen(StartGame.screenStartID);
    }

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
}