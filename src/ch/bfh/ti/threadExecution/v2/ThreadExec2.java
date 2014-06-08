package ch.bfh.ti.threadExecution.v2;

import ch.bfh.ti.threadExecution.tools.PrimeChecker;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 * Created by alain on 06.06.14.
 */
public class ThreadExec2 implements Callable<ArrayList<Integer>> {

    private int minValue;
    private int maxValue;
    private ArrayList<Integer> primes;

    ThreadExec2(int min, int max) {
        minValue = min;
        maxValue = max;
        primes = new ArrayList<Integer>();
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        for (int i = minValue; i <= maxValue; i++) {
            if (PrimeChecker.isPrime(i))
                primes.add(i);
        }
        return primes;
    }
}