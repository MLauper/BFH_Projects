package ch.bfh.ti.tscheims1.v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ThreadHelper {
    public static ArrayList<String> getThreadNames(int amount) {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("projects/src/ch/bfh/ti/tscheims1/v1/threadnames.txt"));

            int i = 0;
            while (scanner.hasNextLine() && i < amount) {
                i++;
                list.add(scanner.nextLine().replace("\\n", "").replace("\\r", ""));
            }
            for (int count = 0; i < amount; i++, count++) {
                list.add(list.get(count));
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }
}
