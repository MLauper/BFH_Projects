package ch.bfh.ti.lottery.backend;

import ch.bfh.ti.lottery.tickets.Marshall;
import ch.bfh.ti.lottery.tickets.TicketTools;
import ch.bfh.ti.lottery.tickets.Tickets;

/**
 * This is the logic of the lottery system.
 */
public class Lottery {

    private Tickets lotteryTicketPool = null;
    private DrawStatistics drawStats = null;
    private int[] luckyNumbers = new int[5];
    private int[] luckyStars = new int[2];
    private String[] luckySuperStars = new String[4];

    private int nextTicketId = 0;


    public Lottery() {
        this.lotteryTicketPool = new Tickets();
        this.drawStats = new DrawStatistics();

    }

    public void generateTickets(int toGenerateTickets, int playsPerTicket) {
        for (int i = 0; i < toGenerateTickets; i++) {
            lotteryTicketPool.getTicket().add(TicketTools.generateRandomTicket(this.nextTicketId, playsPerTicket));
            this.nextTicketId++;
        }
    }

    public void draw() {
        drawStats.drawLottery(lotteryTicketPool, luckySuperStars, luckyNumbers, luckyStars);
        drawStats.printStatistics();
    }

    public void setSetLuckyNumbers(int a, int b, int c, int d, int e) {
        this.luckyNumbers[0] = a;
        this.luckyNumbers[1] = b;
        this.luckyNumbers[2] = c;
        this.luckyNumbers[3] = d;
        this.luckyNumbers[4] = e;
    }

    public void setSetLuckyStars(int a, int b) {
        this.luckyStars[0] = a;
        this.luckyStars[1] = b;
    }

    public void setSetLuckySuperStars(String a, String b, String c, String d) {
        this.luckySuperStars[0] = a;
        this.luckySuperStars[1] = b;
        this.luckySuperStars[2] = c;
        this.luckySuperStars[3] = d;
    }

    public void addXmlTicket() {

    }

    /**
     * replace
     *
     * @param xmlFile XML file with full path name e.g. /var/data/tickets.xml
     * @param replace if true then the new pool replaces the current pool
     */
    public void addXmlTickets(String xmlFile, Boolean replace) {
        Tickets newlotteryTicketPool = Marshall.unMarshall(xmlFile);

        if (replace) {
            this.lotteryTicketPool = newlotteryTicketPool;
        } else {
            this.lotteryTicketPool.getTicket().addAll(newlotteryTicketPool.getTicket());
        }
    }
}
