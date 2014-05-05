package ch.bfh.ti.quizduel.game;

import java.util.ArrayList;

/**
 * Game engine. Central class to manage all operations of bla
 */
public class Game {

    private ArrayList<Player> playerPool = new ArrayList<Player>();
    private ArrayList<Duel> duelPool = new ArrayList<Duel>();
    private ArrayList<Question> questionPool = new ArrayList<Question>();

    private int nextPlayerID = 1;
    private int nextDuelID = 1;

    //public

    public Game() {
        System.out.println("Spiel-Klasse gestartet");
    }

    public int getNumberOfPlayers() {
        return playerPool.size();
    }

    public Boolean getPlayerDuels(int playerID) {
        ArrayList<Duel> playersTurn = new ArrayList<>();
        ArrayList<Duel> opponentsTurn = new ArrayList<>();
        ArrayList<Duel> finished = new ArrayList<>();
        for (Duel d : duelPool) {
            if (d.isPlayerIdInvolved(playerID)) {
                if (d.getCurrentTurnPlayerID() == playerID && !d.isDuelFinished()) {
                    playersTurn.add(d);
                }
                if (d.getCurrentTurnPlayerID() != playerID && !d.isDuelFinished()) {
                    opponentsTurn.add(d);
                }
                if (d.isDuelFinished()) {
                    finished.add(d);
                }
            }
        }

        int sumOfAllDuels = playersTurn.size() + opponentsTurn.size() + finished.size();
        if (sumOfAllDuels < 1) {
            return false;
        }

        if (playersTurn.size() > 0) {
            System.out.println("");
            System.out.println("Duelle, welche du am zug bist:");
            for (Duel d : playersTurn) {
                d.printDuelDetails();
            }
        }
        if (opponentsTurn.size() > 0) {
            System.out.println("");
            System.out.println("Duelle, welche dein Gegner am zug ist:");
            for (Duel d : opponentsTurn) {
                d.printDuelDetails();
            }
        }
        if (finished.size() > 0) {
            System.out.println("");
            System.out.println("Deine beendeten Duelle");
            for (Duel d : finished) {
                d.printDuelDetails();
            }
        }
        return true;
    }

    public String getPlayerNameOfID(int playerID) {
        String playerName = "";

        for (Player p : playerPool) {
            if (p.getPlayerID() == playerID) {
                playerName = p.getPlayerName();
            }
        }
        return playerName;
    }

    public Duel getDuelbyId(int duelId) {
        for (Duel d : duelPool) {
            if (d.getDuelID() == duelId) {
                return d;
            }
        }
        return null;
    }

    public void addPlayer(String playerName) {
        playerPool.add(new Player(playerName, nextPlayerID));
        nextPlayerID++;
    }

    public int addDuell(int player1, int player2) {
        Player p1 = null;
        Player p2 = null;

        for (Player p : playerPool) {
            if (p.getPlayerID() == player1) {
                p1 = p;
            }
        }
        for (Player p : playerPool) {
            if (p.getPlayerID() == player2) {
                p2 = p;
            }
        }
        return this.addDuell(p1, p2);
    }

    private int addDuell(Player player1, Player player2) {
        duelPool.add(new Duel(player1, player2, nextDuelID, questionPool));
        nextDuelID++;
        return nextPlayerID - 1;
    }

    public void addQuestionToPool(String q, int n, String a, String aTrueFalse, String b,
                                  String bTrueFalse, String c, String cTrueFalse, String d, String dTrueFalse) {
        questionPool.add(new Question(q, n, a, aTrueFalse, b, bTrueFalse, c, cTrueFalse, d, dTrueFalse));
    }

    public void addQuestionPool(ArrayList<Question> qPool) {
        questionPool.addAll(qPool);
    }

    public Boolean isPlayerIdValid(int playerId) {
        Boolean isIdTrue = false;

        for (Player p : playerPool) {
            if (p.getPlayerID() == playerId) {
                isIdTrue = true;
                return isIdTrue;
            }
        }
        return isIdTrue;
    }

    public Boolean isDuelIdValid(int duelId) {
        Boolean isIdTrue = false;

        for (Duel d : duelPool) {
            if (d.getDuelID() == duelId) {
                isIdTrue = true;
                return isIdTrue;
            }
        }
        return isIdTrue;
    }

    public void listAllPlayers() {
        for (Player p : playerPool) {
            System.out.println(p.getPlayerID() + ":" + p.getPlayerName());
        }
    }

    public void listAllQuestions() {
        for (Question q : questionPool) {
            System.out.println(q.getQuestion());
            System.out.println(q.getAnswer(0));
            System.out.println(q.getAnswer(1));
            System.out.println(q.getAnswer(2));
            System.out.println(q.getAnswer(3));
            System.out.println(q.getCorrectAnswerID());
            System.out.println(q.getQuestionNum());
            System.out.println("");
        }
    }

}