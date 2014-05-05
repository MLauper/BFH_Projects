package ch.bfh.ti.quizduel.game;

/**
 * Represents one player
 */
public class Player {
    private String playerName = "";
    private int playerID = -1;

    /**
     * Constructor
     */
    public Player(String playerName, int playerID) {
        this.playerName = playerName;
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerID() {
        return playerID;
    }
}
