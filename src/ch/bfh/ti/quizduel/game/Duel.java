package ch.bfh.ti.quizduel.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Class for handling one duel
 */
public class Duel {
    int counterRoundNum = 0;
    private int duelID = -1;
    private Player[] duelPlayers = new Player[2];
    private int currentPlayer = -1;
    private int currentRound = -1;
    private int currentRoundNum = -1;
    private int currentQuestion = -1;
    private Boolean isFinished = false;
    private int[] scoreOfPlayers = new int[2];

    private ArrayList<Question> questionPoolDuel = new ArrayList<>();
    private ArrayList<Question> questionPoolRound1 = new ArrayList<>();
    private ArrayList<Question> questionPoolRound2 = new ArrayList<>();
    private ArrayList<Question> questionPoolRound3 = new ArrayList<>();
    private ArrayList<Question> questionPoolRound4 = new ArrayList<>();
    private ArrayList<Question> questionPoolRound5 = new ArrayList<>();
    private ArrayList<Question> questionPoolRound6 = new ArrayList<>();
    private ArrayList<ArrayList> roundQuestionPools = new ArrayList<>();

    private Random randomGenerator;

    /**
     * Constructor
     *
     * @param player1 ID of first player
     * @param player2 ID of opponent player
     * @param duelID  next duel ID
     */
    public Duel(Player player1, Player player2, int duelID, ArrayList<Question> questionPool) {
        this.duelPlayers[0] = player1;
        this.duelPlayers[1] = player2;
        this.duelID = duelID;
        this.questionPoolDuel.addAll(questionPool);
        this.randomGenerator = new Random();
        this.prepareDuel();
        this.currentPlayer = 0;
        this.currentRound = 1;
        this.currentRoundNum = 1;
        this.currentQuestion = 1;
        this.scoreOfPlayers[0] = 0;
        this.scoreOfPlayers[1] = 0;
    }

    public int getDuelID() {
        return duelID;
    }

    public Question getNextQuestion() {
        Question question;
        question = (Question) roundQuestionPools.get(currentRound - 1).get(currentQuestion - 1);

        if (currentPlayer == 0) {
            if (currentQuestion < 3) {
                currentQuestion++;
            } else {
                currentQuestion = 1;
                currentPlayer = 1;
                Collections.shuffle(roundQuestionPools.get(currentRound - 1));
            }
        } else if (currentQuestion < 3) {
            currentQuestion++;
        } else {
            currentQuestion = 1;
            currentPlayer = 0;
            currentRound++;
        }
        if (currentRound > 6) {
            isFinished = true;
        }
        return question;
    }

    public int getCurrentRoundNum() {
        counterRoundNum++;
        if (counterRoundNum > 6) {
            counterRoundNum = 0;
            currentRoundNum++;
            return currentRoundNum;
        }
        return currentRoundNum;
    }

    public int getCurrentTurnPlayerID() {
        return this.duelPlayers[currentPlayer].getPlayerID();
    }

    public void addScoreToCurrentPlayer() {
        scoreOfPlayers[currentPlayer]++;
    }

    public Boolean isPlayerIdInvolved(int playerID) {

        if (playerID == duelPlayers[0].getPlayerID() || playerID == duelPlayers[1].getPlayerID()) {
            return true;
        }
        return false;
    }

    public Boolean isDuelFinished() {
        return isFinished;
    }

    public void printDuelDetails() {
        System.out.println("Duell ID:Spieler 1(Punkte):Spieler 2(Punkte):Duell beendet");
        System.out.println(duelID + ":" +
                        duelPlayers[0].getPlayerName() + "(" + scoreOfPlayers[0] + "):" +
                        duelPlayers[1].getPlayerName() + "(" + scoreOfPlayers[1] + "):" +
                        isFinished
        );
    }

    /**
     * Prepares the duel questions randomly
     */
    public void prepareDuel() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 4; j++) {
                int index = randomGenerator.nextInt(questionPoolDuel.size());
                switch (i) {
                    case 1:
                        questionPoolRound1.add(questionPoolDuel.get(index));
                        break;
                    case 2:
                        questionPoolRound2.add(questionPoolDuel.get(index));
                        break;
                    case 3:
                        questionPoolRound3.add(questionPoolDuel.get(index));
                        break;
                    case 4:
                        questionPoolRound4.add(questionPoolDuel.get(index));
                        break;
                    case 5:
                        questionPoolRound5.add(questionPoolDuel.get(index));
                        break;
                    case 6:
                        questionPoolRound6.add(questionPoolDuel.get(index));
                        break;
                    default:
                        break;
                }
                questionPoolDuel.remove(index);
            }
        }
        roundQuestionPools.add(questionPoolRound1);
        roundQuestionPools.add(questionPoolRound2);
        roundQuestionPools.add(questionPoolRound3);
        roundQuestionPools.add(questionPoolRound4);
        roundQuestionPools.add(questionPoolRound5);
        roundQuestionPools.add(questionPoolRound6);
    }
}
