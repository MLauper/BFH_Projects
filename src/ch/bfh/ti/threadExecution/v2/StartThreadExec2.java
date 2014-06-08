package ch.bfh.ti.threadExecution.v2;

import ch.bfh.ti.threadExecution.tools.PrimeChecker;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by alain on 07.05.14.
 */
public class StartThreadExec2 {

    private static int m;
    private static ArrayList<Integer> calculatedPrimes = new ArrayList<>();

    public static void main(String[] args) {


        // Get valid user input for the highest number (m) to check prime
        Boolean isInpuOK = false;
        while (!isInpuOK) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("");
                System.out.print("Bitte angeben bis wie hoch Primzahl berechnet werden soll : ");
                m = in.nextInt();
                if (m > 0) {
                    isInpuOK = true;
                } else {
                    System.out.println("");
                    System.out.println("Bitte Integer > 0 eingeben!");
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("Bitte einen Interger eingeben!");
            }
        }
        isInpuOK = false;
        System.out.println(m);


        for (int i = 0; i < m; i++) {
            if (PrimeChecker.isPrime(i)) {
                calculatedPrimes.add(i);
            }
        }




    }
}
