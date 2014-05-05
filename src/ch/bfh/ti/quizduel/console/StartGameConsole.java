package ch.bfh.ti.quizduel.console;

import ch.bfh.ti.quizduel.game.Game;
import ch.bfh.ti.quizduel.game.Question;
import ch.bfh.ti.quizduel.game.QuestionLoader;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class for bla start
 */
public class StartGameConsole {

    public static void main(String[] args) {

        Game game = new Game();
        Console console = new Console(game);

        Scanner inQuestionModus = new Scanner(System.in);
        int qModus = -1;
        try {
            System.out.println("Wähle Question-Modus - 0 für XML, 1 für generierte Fragen.");
            System.out.print("Wahl: ");
            qModus = inQuestionModus.nextInt();
        } catch (InputMismatchException e) {
            inQuestionModus.nextLine();
        }

        switch (qModus) {
            case 0:
                ArrayList<Question> testquest = null;
                QuestionLoader q = new QuestionLoader();
                try {
                    testquest = q.loadquestions();
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
                game.addQuestionPool(testquest);
                break;
            default:
                for (int i = 0; i < 100; i++) {
                    game.addQuestionToPool("Frage " + i, i,
                            "Antwort A", "false",
                            "Antwort B", "false",
                            "Antwort C", "false",
                            "Antwort D", "true");
                }
                break;
        }

        game.listAllQuestions();
        console.runConsole();

    }
}
