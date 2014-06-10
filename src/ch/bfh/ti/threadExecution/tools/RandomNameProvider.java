package ch.bfh.ti.threadExecution.tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alain on 06.06.14.
 */
public class RandomNameProvider {

    private static ArrayList<String> firstNameList = new ArrayList<>();
    private static int counter = 0;

    public static void readTextFile() throws Exception {

        String strLine;
        // Open the file
        FileInputStream fstream = new FileInputStream("src/ch/bfh/ti/threadExecution/tools/firstNameList.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console
            firstNameList.add(strLine);
            //System.out.println(strLine);
        }
        //Close the input stream
        br.close();
    }

    public static String getRandomName() {

        if (firstNameList.size() == 0) {
            try {
                readTextFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Random random = new Random();
        int index = random.nextInt(firstNameList.size());
        String name = firstNameList.get(index);
        counter++;
        return name + "_" + counter;
    }
}


