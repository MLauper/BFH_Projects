package ch.bfh.ti.lottery;

import ch.bfh.ti.lottery.backend.Lottery;

/**
 * Created by alain on 07.05.14.
 */
public class StartLottery {

    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        lottery.generateTickets(500, 2);
        //lottery.writeTicketPoolToXml("/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/ticPool.xml");
        lottery.addXmlTickets("/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/ticPool.xml", false);

        lottery.setSetLuckyNumbers(19,23,8,9,15);
        lottery.setSetLuckyStars(4,10);
        lottery.setSetLuckySuperStars("A123B","V252G","R835F","B923C");

        lottery.draw();
        lottery.writeTicketPoolToXml("/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/ticPool.xml");

        System.out.println("Totel tickets in pool: " + lottery.getTotalTicketsInPool());

    }
}
