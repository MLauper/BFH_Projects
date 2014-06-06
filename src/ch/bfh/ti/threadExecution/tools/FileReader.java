package ch.bfh.ti.threadExecution.tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by alain on 06.06.14.
 */
public class FileReader {

    String strLine;

    public FileReader() {
    }


    private void readFile() throws Exception {

        // Open the file
        FileInputStream fstream = new FileInputStream("projects/src/ch/bfh/ti/threadExecution/tools/firstNameList.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console
            System.out.println(strLine);
        }

        //Close the input stream
        br.close();
    }
}

