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
            int randomSleep = r.nextInt(milSecsHigh - milSecsLow) + milSecsLow;
            try {
                Thread.sleep(randomSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
            if (PrimeChecker.isPrime(counter)) {
                highestPrime = counter;
            }
            System.out.println(threadName + " did a ckeck with number \"" + counter + "\" (RandomSleeper: " + randomSleep + "[ms])");
        }
    }
}
