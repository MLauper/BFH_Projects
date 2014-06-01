package ch.bfh.ti.lottery.backend;

import ch.bfh.ti.lottery.tickets.TicketTools;
import ch.bfh.ti.lottery.tickets.Tickets;

/**
 * This is the logic of the lottery system.
 */
public class Lottery {

    Tickets lotteryTicketPool = null;
    private int nextTicketId = 0;

    public Lottery(Tickets lotteryTicketPool) {
        this.lotteryTicketPool = new Tickets();
    }

    public void generateTickets(int toGenerateTickets, int playsPerTicket){
        for (int i = 0; i < toGenerateTickets; i++) {
            lotteryTicketPool.getTicket().add(TicketTools.generateRandomTicket(this.nextTicketId, playsPerTicket));
            this.nextTicketId++;
        }
    }




}
