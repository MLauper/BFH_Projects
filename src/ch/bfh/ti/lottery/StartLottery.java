package ch.bfh.ti.lottery;

import ch.bfh.ti.lottery.backend.Lottery;

/**
 * Created by alain on 07.05.14.
 */
public class StartLottery {

    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        lottery.generateTickets(200000, 5);

        lottery.setSetLuckyNumbers(19,23,8,9,15);
        lottery.setSetLuckyStars(4,10);
        lottery.setSetLuckySuperStars("A123B","V252G","R835F","B923C");

        lottery.draw();

    }
}
