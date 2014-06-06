package ch.bfh.ti.threadExecution.v1;

import ch.bfh.ti.threadExecution.tools.PrimeChecker;

import java.util.Random;

/**
 * Created by alain on 06.06.14.
 */
public class ThreadExec1 extends Thread {

    private String threadName = null;
    private Boolean isRunning = true;
    private int counter = 0;
    private int highestPrime = 0;
    int milSecsLow = 10;
    int milSecsHigh = 1001;

    public ThreadExec1(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public int getHighestPrime() {
        return highestPrime;
    }

    public void stopThread() {
        this.isRunning = false;
    }


    @Override
    public void run() {
        Random r = new Random();
        while (isRunning) {
            try {
                Thread.sleep(r.nextInt(milSecsHigh - milSecsLow) + milSecsLow);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
            if (PrimeChecker.isPrime(counter)) {
                highestPrime = counter;
            }
        }
    }
}
