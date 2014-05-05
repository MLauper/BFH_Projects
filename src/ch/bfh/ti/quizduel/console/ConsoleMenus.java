package ch.bfh.ti.quizduel.console;

/**
 * Separate class for menu text
 */
public class ConsoleMenus {

    String menuOpCreateNewPlayer = "Neuer Spieler erstellen";
    String menuOpListAllPlayers = "Spielerliste anzeigen";
    String menuOpStartNewDuel = "Neues Duell erstellen";
    String menuOpRunningDuels = "Duelle spielen/ansehen";
    String menuOpQuitQuizDuel = "Quiz Duell verlassen";

    String menuOpEnterNewPlayerName = "Bitte Name des neuen Spielers eingeben";

    public ConsoleMenus() {
    }

    public void printMenuStart() {
        System.out.println("");
        System.out.println("1) " + menuOpCreateNewPlayer);
        System.out.println("2) " + menuOpListAllPlayers);
        System.out.println("3) " + menuOpStartNewDuel);
        System.out.println("4) " + menuOpRunningDuels);
        System.out.println("0) " + menuOpQuitQuizDuel);
    }

    public void printNewUserDialog() {
        System.out.println("");
        System.out.println(menuOpEnterNewPlayerName);
    }

}
