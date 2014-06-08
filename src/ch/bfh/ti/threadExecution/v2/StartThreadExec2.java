package ch.bfh.ti.threadExecution.v2;

import ch.bfh.ti.threadExecution.tools.PrimeChecker;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 * Created by alain on 07.05.14.
 */
public class StartThreadExec2 {

    private static int m;
    private static int n;
    private static ArrayList<Integer> calculatedPrimes = new ArrayList<>();
    private static ArrayList<Integer> calculatedPrimesThreaded = new ArrayList<>();

    public static void main(String[] args) {


        // Get valid user input for the highest number (m) to check prime
        Boolean isInpuOK = false;
        while (!isInpuOK) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("");
                System.out.print("Bitte angeben bis wie hoch Primzahl berechnet werden soll [1-15000]: ");
                m = in.nextInt();
                if (m > 0 && m < 15001) {
                    isInpuOK = true;
                } else {
                    System.out.println("");
                    System.out.println("Bitte Integer(m) mit Bedingung \"0 < m < 15001\" eingeben!");
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("Bitte einen Interger eingeben!");
            }
        }
        isInpuOK = false;
        System.out.println("*OK*");

        // Get user input for how many threads (n) should be started
        while (!isInpuOK) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("");
                System.out.print("Anzahl Threads [1-1000]: ");
                n = in.nextInt();
                if (n > 0 && n < 1001) {
                    isInpuOK = true;
                } else {
                    System.out.println("");
                    System.out.println("Bitte Integer(n) mit Bedingung \"0 < n < 1001\" eingeben!");
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.print("Bitte einen Interger eingeben!");
            }
        }
        System.out.println("*OK*");

        System.out.println("");
        System.out.print("Start calculation with single thread...");
        long startSingleCalc = System.currentTimeMillis();
        for (int i = 0; i <= m; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (PrimeChecker.isPrime(i)) {
                calculatedPrimes.add(i);
            }
            ;
        }
        long endSingleCalc = System.currentTimeMillis();
        long totalSingleCalc = endSingleCalc - startSingleCalc;
        System.out.println("finished.   Starting now threaded version...");

        int numLastThread = 0;
        int proThread;
        if (m % n == 0) {
            proThread = m / n;
        } else {
            numLastThread = m % n;
            proThread = (m - numLastThread) / n;
        }

        //Get ExecutorService from Executors utility class, thread pool size is n
        ExecutorService executor = Executors.newFixedThreadPool(n);

        //create a list to hold the Future object associated with Callable
        List<Future<ArrayList<Integer>>> list = new ArrayList<Future<ArrayList<Integer>>>();


        int start = 1;
        int end = proThread;
        long endThreadedCalc = 0;
        long startThreadedCalc = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {

            //Create ThreadExec2 instance
            ThreadExec2 callable = new ThreadExec2(start, end);

            //submit Callable tasks to be executed by thread pool
            Future<ArrayList<Integer>> future = executor.submit(callable);

            //add Future to the list, we can get return value using Future
            list.add(future);

            start += proThread;
            end += proThread;
        }
        if (numLastThread != 0) {

            //start = start - proThread + 1;
            end = start + numLastThread;

            //Create ThreadExec2 instance
            ThreadExec2 callable = new ThreadExec2(start, end - 1);

            //submit Callable tasks to be executed by thread pool
            Future<ArrayList<Integer>> future = executor.submit(callable);

            //add Future to the list, we can get return value using Future
            list.add(future);
        }

        Boolean isFirstRound = true;
        for (Future<ArrayList<Integer>> fut : list) {
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                calculatedPrimesThreaded.addAll(fut.get());
                if (isFirstRound){
                    endThreadedCalc = System.currentTimeMillis();
                    isFirstRound = false;
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();

        long totalThreadedCalc = endThreadedCalc - startThreadedCalc;
        System.out.println("");
        System.out.println("Finished with threaded calculation. Comparing arrays...");

        System.out.println("");
        if (calculatedPrimes.size() == calculatedPrimesThreaded.size()) {
            System.out.print("Arrays are equal! Checking content...");
            Boolean isOK = true;
            for (int i = 0; i < calculatedPrimes.size(); i++) {
                if (calculatedPrimes.get(i) != (int) calculatedPrimesThreaded.get(i)) {
                    System.out.println("");
                    System.out.print("Index " + i + " is NOT ok!");
                    System.out.println(" --> " + calculatedPrimes.get(i) + " is not " + calculatedPrimesThreaded.get(i));
                    isOK = false;
                }
                ;
            }
            if (isOK) {
                System.out.println(" Everything is fine - well done!");
            }
        } else {
            System.out.println("Arrays are NOT equal!");
        }

        long totalSingleCalcSecs = (totalSingleCalc - totalSingleCalc % 1000) / 1000;
        long totalSingleCalcMS = totalSingleCalc % 1000;

        long totalThreadedCalcSecs = (totalThreadedCalc - totalThreadedCalc % 1000) / 1000;
        long totalThreadedCalcMS = totalThreadedCalc % 1000;

        System.out.println("");
        System.out.println("Total time with single calculation:    " + totalSingleCalcSecs + "[s] " + totalSingleCalcMS + "[ms]");
        System.out.println("Total time with multiple calculations: " + totalThreadedCalcSecs + "[s] " + totalThreadedCalcMS + "[ms]");

        System.out.println("");
    }
}

