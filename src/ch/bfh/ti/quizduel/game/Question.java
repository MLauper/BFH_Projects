package ch.bfh.ti.quizduel.game;

/**
 * This class represents one question.
 */
public class Question {
    private String question = "";
    private int questionNum = -1;
    private String[][] answer = new String[4][2];

    /**
     * Constructs a question
     *
     * @param q          the question
     * @param n          the question number (id)
     * @param a          answer a
     * @param aTrueFalse declares answer as true or false
     * @param b          answer b
     * @param bTrueFalse declares answer as true or false
     * @param c          answer c
     * @param cTrueFalse declares answer as true or false
     * @param d          answer d
     * @param dTrueFalse declares answer as true or false
     */
    public Question(String q, int n, String a, String aTrueFalse, String b,
                    String bTrueFalse, String c, String cTrueFalse, String d, String dTrueFalse) {
        question = q;
        questionNum = n;
        answer[0][0] = a;
        answer[0][1] = aTrueFalse;
        answer[1][0] = b;
        answer[1][1] = bTrueFalse;
        answer[2][0] = c;
        answer[2][1] = cTrueFalse;
        answer[3][0] = d;
        answer[3][1] = dTrueFalse;
    }

    public String getAnswer(int answerID) {
        return answer[answerID][0];
    }

    public int getCorrectAnswerID() {
        int correctAnswerID = -1;

        for (int i = 0; i < answer.length; i++) {
            if (Boolean.parseBoolean(answer[i][1])) {
                correctAnswerID = i;
            }
        }
        return correctAnswerID;
    }

    public String getQuestion() {
        return question;
    }

    public int getQuestionNum() {
        return questionNum;
    }

    public Boolean validatePlayerAnswer(int answerId) {
        System.out.println("Die korrekte Anwort ist: " + answer[this.getCorrectAnswerID()][0]);
        if (answerId - 1 == this.getCorrectAnswerID()) {
            System.out.println("--> Du lagst richtig! Was für ein Genie! // :-)");
            return true;
        } else {
            System.out.println("--> Leider falsch! Geh besser nochmal über die Bücher //  :-(");
        }
        return false;
    }

    public void shuffleAnswers() {
        int n = answer.length;
        for (int i = 0; i < n; i++) {
            // between i and n-1
            int r = i + (int) (Math.random() * (n - i));
            String[] tmp = answer[i];    // swap
            answer[i] = answer[r];
            answer[r] = tmp;
        }
    }

}
