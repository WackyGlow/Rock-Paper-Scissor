package rps.bll.player;

//Project imports
import rps.bll.game.GameState;
import rps.bll.game.IGameState;
import rps.bll.game.Move;
import rps.bll.game.Result;

//Java imports
import java.util.ArrayList;

/**
 * Example implementation of a player.
 *
 * @author smsj
 */
public class Player implements IPlayer {

    private String name;
    private PlayerType type;
    private GameState gameState;
    public static int totalPlays;
    public static int rocks;
    public static int papers;
    public static int scissors;
    public static int rocksPercent;
    public static int papersPercent;
    public static int scissorsPercent;

    /**
     * @param name
     */
    public Player(String name, PlayerType type) {
        this.name = name;
        this.type = type;
        scissors = 1;
        rocks = 1;
        papers = 1;
        totalPlays = 3;

    }


    @Override
    public String getPlayerName() {
        return name;
    }


    @Override
    public PlayerType getPlayerType() {
        return type;
    }


    /**
     * Decides the next move for the bot...
     * @param state Contains the current game state including historic moves/results
     * @return Next move
     */
    @Override
    public Move doMove(IGameState state) {
        //Historic data to analyze and decide next move...
        ArrayList<Result> results = (ArrayList<Result>) state.getHistoricResults();

        //Implement better AI here...
        rocksPercent = (rocks * 100)/ totalPlays;
        papersPercent = (papers * 100)/ totalPlays;
        scissorsPercent = (scissors * 100)/ totalPlays;
        int randomNum = (int) ((Math.random() * (100 - 1)) + 1);
        if(0 < randomNum && randomNum <= rocksPercent){
            return Move.Paper;
        } else if (rocksPercent < randomNum && randomNum <= (rocksPercent + papersPercent)){
            return Move.Scissor;
        } else if ((rocksPercent + papersPercent) < randomNum && randomNum <= (rocksPercent + papersPercent + scissorsPercent) ){
            return Move.Rock;
        } else {
            return Move.Scissor;
        }
    }
}
