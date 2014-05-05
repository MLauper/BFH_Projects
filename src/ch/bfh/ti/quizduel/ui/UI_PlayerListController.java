package ch.bfh.ti.quizduel.ui;

import ch.bfh.ti.quizduel.game.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by alain on 26.04.14.
 */
public class UI_PlayerListController implements Initializable, ControlledScreen {

    ScreensController myController;

    @FXML
    private ListView<Player> listViewOfPlayers = new ListView<>();
    private boolean isListViewInitialized = false;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    void doDeletePlayer(ActionEvent event) {
    }

    @FXML
    private void gotoStartPage(ActionEvent event) {
        myController.setScreen(StartGame.screenStartID);
    }

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
}