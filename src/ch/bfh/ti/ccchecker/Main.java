package ch.bfh.ti.ccchecker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    private BorderPane rootLayout;
    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    /* (non-Javadoc)
     * Hier wird die Applikation gestartet. JavaFX stage wird vorbereitet und die Scene wird angezeigt
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    Main.class.getResource("/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/ccchecker/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            FXMLLoader loaderstage = new FXMLLoader(
                    Main.class.getResource("/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/ccchecker/CCUi.fxml"));
            AnchorPane anchorPane = (AnchorPane) loaderstage.load();
            rootLayout.setCenter(anchorPane);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
