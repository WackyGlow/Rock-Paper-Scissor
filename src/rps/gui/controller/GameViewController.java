package rps.gui.controller;

// Java imports
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author smsj
 */
public class GameViewController implements Initializable {

    public ImageView rockImage;
    public Button rockButton;
    public ImageView paperImage;
    public Button paperButton;
    public ImageView scissorsImage;
    public Button scissorsButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleRockButton(ActionEvent actionEvent) {
    }

    public void handlePaperButton(ActionEvent actionEvent) {
    }

    public void handleScissorsButton(ActionEvent actionEvent) {
    }
}
