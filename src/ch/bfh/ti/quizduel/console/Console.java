package ch.bfh.ti.quizduel.console;

import ch.bfh.ti.quizduel.game.Game;
import ch.bfh.ti.quizduel.game.Question;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Console application to handle cli menu
 */
public class Console {

    Game game = null;
    Boolean isExitSelected = false;
    int command = -1;
    int currentDuelID = -1;

    /**
     * Constructs a Console object.
     *
     * @param game the bla system
     */
    public Console(Game game) {
        this.game = game;
    }

    /**
     * Starts the main console
     */
    public void runConsole() {
        ConsoleMenus consoleMenus = new ConsoleMenus();

        /**
         The main console menu.
         */
        while (!isExitSelected) {
            consoleMenus.printMenuStart();
            Scanner in = new Scanner(System.in);
            try {
                System.out.print("Eingabe: ");
                command = in.nextInt();
            } catch (InputMismatchException e) {
                in.nextLine();
            }

            switch (command) {
                case 1:  //Create new player
                    Boolean isMenuCreatePlayerActive = true;
                    while (isMenuCreatePlayerActive) {
                        Scanner sc = new Scanner(System.in);

                        consoleMenus.printNewUserDialog();
                        System.out.print("Eingabe: ");
                        String newPlayer = sc.nextLine();

                        if (newPlayer.length() > 0) {
                            game.addPlayer(newPlayer);
                            System.out.println("");
                            System.out.println("Spieler " + newPlayer + " wurde erstellt!");
                            isMenuCreatePlayerActive = false;
                        } else {
                            System.out.println("");
                            System.out.println("Leere Eingabe nicht gültig!");
                        }
                    }
                    break;
                case 2:  //List all players

                    if (game.getNumberOfPlayers() < 1) {
                        System.out.println("");
                        System.out.println("Es wurden noch keine Spieler erfasst!");
                    } else {
                        System.out.println("");
                        System.out.println("Spieler ID:Spielername");
                        game.listAllPlayers();
                    }
                    break;
                case 3:  //Start new duel

                    if (game.getNumberOfPlayers() < 2) {
                        System.out.println("");
                        System.out.println("Es sind noch nicht genügend Spieler erfasst!");
                    } else {
                        Boolean isPlayer1Set = false;
                        Boolean isPlayer2Set = false;
                        Scanner inPlayerID1 = new Scanner(System.in);
                        Scanner inPlayerID2 = new Scanner(System.in);
                        int playerID1 = -1;
                        int playerID2 = -1;

                        while (!isPlayer1Set) {
                            System.out.println("");
                            System.out.println("Wähle deinen Spielername");
                            game.listAllPlayers();

                            try {
                                System.out.println("");
                                System.out.print("ID des Spielers: ");
                                playerID1 = inPlayerID1.nextInt();
                            } catch (InputMismatchException e) {
                                inPlayerID1.nextLine();
                            }
                            if (playerID1 != -1 && game.isPlayerIdValid(playerID1)) {
                                isPlayer1Set = true;
                            }
                            while (!isPlayer2Set) {
                                System.out.println("");
                                System.out.println("Wähle deinen Gegner");
                                game.listAllPlayers();

                                try {
                                    System.out.println("");
                                    System.out.print("ID des Spielers: ");
                                    playerID2 = inPlayerID2.nextInt();
                                } catch (InputMismatchException e) {
                                    inPlayerID2.nextLine();
                                }
                                if (playerID2 != -1 && game.isPlayerIdValid(playerID1)) {
                                    if (playerID1 == playerID2) {
                                        System.out.println("");
                                        System.out.println("Du kannst nicht selber dein Gegner sein!");
                                    } else {
                                        isPlayer2Set = true;
                                    }
                                }
                            }
                        }
                        System.out.println("");
                        currentDuelID = game.addDuell(playerID1, playerID2);
                        System.out.println("Duell: " + game.getPlayerNameOfID(playerID1) + " gegen "
                                + game.getPlayerNameOfID(playerID2) + " ist erstellt!");
                    }

                    break;
                case 4:  //Show players duels
                    if (game.getNumberOfPlayers() < 2) {
                        System.out.println("");
                        System.out.println("Es sind noch nicht genügend Spieler erfasst!");
                    } else {
                        Boolean goBackToMainMenu = false;
                        while (!goBackToMainMenu) {
                            int playerID = -1;
                            int duellID = -1;

                            Boolean isPlayerOK = false;
                            while (!isPlayerOK) {
                                Scanner inPlayerID = new Scanner(System.in);

                                System.out.println("");
                                System.out.println("Wähle deinen Spielername");
                                game.listAllPlayers();

                                try {
                                    System.out.println("");
                                    System.out.print("ID des Spielers: ");
                                    playerID = inPlayerID.nextInt();
                                } catch (InputMismatchException e) {
                                    inPlayerID.nextLine();
                                }
                                if (playerID != -1 && game.isPlayerIdValid(playerID)) {
                                    isPlayerOK = true;
                                }
                            }

                            Boolean isDuelIdOK = false;
                            while (!isDuelIdOK) {
                                Scanner inDuelID = new Scanner(System.in);

                                System.out.println("");
                                System.out.println("Wähle das Duell, welches du spielen möchtest.");
                                game.getPlayerDuels(playerID);

                                try {
                                    System.out.println("");
                                    System.out.print("ID des Duells (0 für exit): ");
                                    duellID = inDuelID.nextInt();
                                } catch (InputMismatchException e) {
                                    inDuelID.nextLine();
                                }
                                if (duellID != -1 && game.isDuelIdValid(duellID) && !game.getDuelbyId(duellID).isDuelFinished()) {
                                    if (game.getDuelbyId(duellID).getCurrentTurnPlayerID() == playerID) {
                                        isDuelIdOK = true;
                                        goBackToMainMenu = true;

                                        /**
                                         Playing the questions
                                         */
                                        Boolean isRoundStillOn = true;
                                        int questionNumOfRound = 1;
                                        while (isRoundStillOn) {
                                            Scanner inplayerAnswer = new Scanner(System.in);
                                            int playerAnswer = -1;
                                            Question question = game.getDuelbyId(duellID).getNextQuestion();

                                            question.shuffleAnswers();
                                            System.out.println("");
                                            System.out.print("Runde " + game.getDuelbyId(duellID).getCurrentRoundNum() + ") ");
                                            System.out.println(question.getQuestion());
                                            System.out.println("");
                                            for (int i = 0; i < 4; i++) {
                                                System.out.println(i + 1 + ") " + question.getAnswer(i));
                                            }
                                            Boolean isPlayerInputOK = false;
                                            while (!isPlayerInputOK) {
                                                try {
                                                    System.out.println("");
                                                    System.out.print("Deine Antwort: ");
                                                    playerAnswer = inplayerAnswer.nextInt();
                                                } catch (InputMismatchException e) {
                                                    inplayerAnswer.nextLine();
                                                }
                                                if (playerAnswer > 0 && playerAnswer < 5) {
                                                    isPlayerInputOK = true;
                                                }
                                            }
                                            if (question.validatePlayerAnswer(playerAnswer)) {
                                                game.getDuelbyId(duellID).addScoreToCurrentPlayer();
                                            }
                                            ;
                                            questionNumOfRound++;
                                            if (questionNumOfRound > 3) {
                                                isRoundStillOn = false;
                                            }
                                        }
                                    }
                                }
                                if (duellID == 0) {
                                    goBackToMainMenu = true;
                                    isDuelIdOK = true;
                                }
                            }

                        }
                    }
                    break;
                case 0:  //Exit QuizDuel
                    isExitSelected = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Ungültige Eingabe!!!");
                    break;
            }
            command = -1;
        }
    }
}
