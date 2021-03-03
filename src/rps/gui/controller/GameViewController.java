package rps.gui.controller;

// Java imports
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import rps.bll.game.GameManager;
import rps.bll.game.Move;
import rps.bll.player.IPlayer;
import rps.bll.player.Player;
import rps.bll.player.PlayerType;

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
    private GameManager gameManager;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Player human = new Player("Fugtige MigMig", PlayerType.Human);
        Player robot = new Player("Hall 9000",PlayerType.AI);
        gameManager = new GameManager(human,robot);
        // TODO
    }

    public void handleRockButton(ActionEvent actionEvent) {
        gameManager.playRound(Move.Rock);
        Player.rocks ++;
        Player.totalPlays ++;
    }

    public void handlePaperButton(ActionEvent actionEvent) {
        gameManager.playRound(Move.Paper);
        Player.papers ++;
        Player.totalPlays ++;
    }

    public void handleScissorsButton(ActionEvent actionEvent) {
        gameManager.playRound(Move.Scissor);
        Player.scissors ++;
        Player.totalPlays ++;
    }
}
