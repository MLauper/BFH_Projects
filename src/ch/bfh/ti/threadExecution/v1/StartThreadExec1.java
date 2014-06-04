package ch.bfh.ti.threadExecution.v1;

import ch.bfh.ti.threadExecution.tools.PrimeChecker;

/**
 * Created by alain on 07.05.14.
 */
public class StartThreadExec1 {

    private static int m;
    private static int n;


    public static void main(String[] args) {


        // Get user input for the highest number (m) to check prime
        m = 100;

        // Get user input for how many threads (n) should be started


        // start the n threads


        // start calculating prime until m

        for (int i = 0; i < m + 1; i++) {
            PrimeChecker.isPrime(i);
        }

        // stop all other threads and list highest num of each thread


    }
}
