package ch.bfh.ti.quizduel.game;

import ch.bfh.ti.quizduel.jaxb.Answer;
import ch.bfh.ti.quizduel.jaxb.Quiz;
import ch.bfh.ti.quizduel.jaxb.Row;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public final class QuestionLoader {

    //shuffle answers because the xml-file lists the correct answer always on position 0
    public static ArrayList<Answer> shuffleAnswers(ArrayList<Answer> list) {
        if (list.size() > 0) {
            ArrayList<Answer> copy = new ArrayList<>();
            for (Answer answer : list)
                copy.add(answer);
            Random generator = new Random();
            ArrayList<Answer> result = new ArrayList<>();
            do {
                int index = (int) (generator.nextDouble() * (double) copy.size());
                result.add(copy.remove(index));
            } while (copy.size() > 0);
            return result;
        } else
            return new ArrayList<>();
    }

    public ArrayList<Question> loadquestions() throws JAXBException {

        ArrayList<Question> questions = new ArrayList<>();

        JAXBContext jc = JAXBContext.newInstance("questionLoader.jaxb");
        Unmarshaller u = jc.createUnmarshaller();
        Quiz quiz = (Quiz) u.unmarshal(new File("ch/bfh/ti/quizduel/game/questions.xml"));

        //get all questions with answers and save them into an arraylist
        ArrayList<Row> rows = (ArrayList<Row>) quiz.getRow();

        int questionnumber = 0;

        for (Row r : rows) {
            //get question
            String question = r.getQuestion();

            //get answers
            String[][] answer = new String[4][2];
            int answernumber = 0;

            //shuffle answers and save them into a new arraylist
            ArrayList<Answer> answers = shuffleAnswers((ArrayList<Answer>) r.getAnswer());
            for (Answer a : answers) {
                answer[answernumber][0] = a.getContent();
                answer[answernumber][1] = a.getResult();
                answernumber++;
            }

            Question q = new Question(question, questionnumber, answer[0][0], answer[0][1], answer[1][0], answer[1][1], answer[2][0], answer[2][1], answer[3][0], answer[3][1]);
            questions.add(q);

//	    	 System.out.println("-- Frage Nr. " + questionnumber + " -----------------------------");
//	    	 System.out.println("Frage: " + question);
//	    	 System.out.println("Antworten:");
//	    	 System.out.println("Antwort Nr. 1: " + answer[0][0] + " - " + answer[0][1]);
//	    	 System.out.println("Antwort Nr. 2: " + answer[1][0] + " - " + answer[1][1]);
//	    	 System.out.println("Antwort Nr. 3: " + answer[2][0] + " - " + answer[2][1]);
//	    	 System.out.println("Antwort Nr. 4: " + answer[3][0] + " - " + answer[3][1]);
//	    	 System.out.println("----------------------------------------------");

            questionnumber++;
        }

        return questions;
    }
}