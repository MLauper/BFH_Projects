package ch.bfh.ti.threadExecution.tools;

/**
 * Created by alain on 07.05.14.
 */

public class PrimeChecker {

    public static boolean isPrime(int no) {
        if (no < 2) return false;
        for (int i = 2; i < no; i++)
            if (no % i == 0) return false;
        return true;
    }
}
