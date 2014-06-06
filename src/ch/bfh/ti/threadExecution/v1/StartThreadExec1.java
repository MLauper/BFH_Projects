package ch.bfh.ti.threadExecution.v1;

import ch.bfh.ti.threadExecution.tools.PrimeChecker;
import ch.bfh.ti.threadExecution.tools.RandomNameProvider;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by alain on 07.05.14.
 */
public class StartThreadExec1 {

    private static int m;
    private static int n;
    private static ArrayList<ThreadExec1> threadExec1ArrayList = null;


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

        // Get user input for how many threads (n) should be started
        while (!isInpuOK) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("");
                System.out.print("Anzahl Threads: ");
                n = in.nextInt();
                if (n > 0) {
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
        System.out.println(n);

        // start the n threads
        threadExec1ArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            threadExec1ArrayList.add(new ThreadExec1(RandomNameProvider.getRandomName()));
        }
        System.out.println("");
        for (ThreadExec1 thread : threadExec1ArrayList){
            System.out.println("Starting thread: " + thread.getThreadName());
            thread.start();
        }

        System.out.println("");
        System.out.println("Start calculation within main...");
        for (int i = 0; i < m; i++) {
            PrimeChecker.isPrime(i);
        }

        // stop all other threads and list highest num of each thread
        System.out.println("");
        System.out.print("Stopping thread(s): ");
        for (ThreadExec1 thread : threadExec1ArrayList){
            System.out.print(thread.getThreadName() + ", ");
            thread.stopThread();
        }
        System.out.println("");

        System.out.println("");
        for (ThreadExec1 thread : threadExec1ArrayList){
            System.out.print("Highest prime of thread " + thread.getThreadName() + ": " + thread.getHighestPrime());
            System.out.println("");
        }
    }
}
