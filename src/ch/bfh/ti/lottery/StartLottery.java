package ch.bfh.ti.lottery;

import ch.bfh.ti.lottery.backend.Lottery;

/**
 * Created by alain on 07.05.14.
 */
public class StartLottery {

    public static void main(String[] args) {

        Lottery lottery = new Lottery();

<<<<<<< HEAD
        lottery.generateTickets(100, 3);
        //lottery.writeTicketPoolToXml("/Users/Reto/Github/BFH/src/ch/bfh/ti/lottery/ticPool.xml");
        lottery.addXmlTickets("src/ch/bfh/ti/lottery/ticPool.xml", true);
=======
        lottery.generateTickets(1000, 3);
        lottery.writeTicketPoolToXml("ch/bfh/ti/lottery/ticPool.xml");
        lottery.addXmlTickets("ch/bfh/ti/lottery/ticPool.xml", true);
>>>>>>> FETCH_HEAD

        lottery.setSetLuckyNumbers(28,16,7,30,13);
       lottery.setSetLuckyStars(10,9);
       lottery.setSetLuckySuperStars("L994R","V252G","R835F","B923C");
//
<<<<<<< HEAD
       lottery.draw();
       
       lottery.printStats();
        //lottery.writeTicketPoolToXml("/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/ticPool.xml");
=======
        lottery.draw();
        lottery.writeTicketPoolToXml("ch/bfh/ti/lottery/ticPool.xml");
>>>>>>> FETCH_HEAD

        System.out.println("Totel tickets in pool: " + lottery.getTotalTicketsInPool());

    }
}
