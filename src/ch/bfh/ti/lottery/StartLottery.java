package ch.bfh.ti.lottery;

import ch.bfh.ti.lottery.backend.Lottery;

/**
 * Created by alain on 07.05.14.
 */
public class StartLottery {

    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        lottery.generateTickets(1000, 3);
        lottery.writeTicketPoolToXml("projects/src/ch/bfh/ti/lottery/ticPool.xml");
        lottery.addXmlTickets("projects/src/ch/bfh/ti/lottery/ticPool.xml", true);

        lottery.setSetLuckyNumbers(5,31,23,21,29);
        lottery.setSetLuckyStars(7,9);
        lottery.setSetLuckySuperStars("A123B","V252G","R835F","B923C");
//
        lottery.draw();
        lottery.writeTicketPoolToXml("/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/ticPool.xml");

        System.out.println("Totel tickets in pool: " + lottery.getTotalTicketsInPool());

    }
}
