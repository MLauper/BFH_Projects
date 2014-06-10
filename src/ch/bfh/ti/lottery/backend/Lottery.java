package ch.bfh.ti.lottery.backend;

import ch.bfh.ti.lottery.tickets.Marshall;
import ch.bfh.ti.lottery.tickets.TicketTools;
import ch.bfh.ti.lottery.tickets.TicketType.Plays.Play;
import ch.bfh.ti.lottery.tickets.Tickets;
import ch.bfh.ti.lottery.tickets.Tickets.Ticket;

import java.util.ArrayList;

/**
 * This is the logic of the lottery system.
 */
public class Lottery {

    private String xsdTicketFile = "src/ch/bfh/ti/lottery/tickets/ticket.xsd";
    private String xsdTicketsFile = "src/ch/bfh/ti/lottery/tickets/tickets.xsd";
    private Tickets lotteryTicketPool = null;
    private int[] luckyNumbers = new int[5];
    private int[] luckyStars = new int[2];
    private String[] luckySuperStars = new String[4];
    private ArrayList<DrawStatistics> drawStatisticsArrayList;

    private int nextTicketId = 0;


    public Lottery() {
        this.lotteryTicketPool = new Tickets();
        this.drawStatisticsArrayList = new ArrayList<>();
        this.drawStatisticsArrayList.add(new DrawStatistics());

    }

    public void setXsdTicketFile(String xsdTicketFile) {
        this.xsdTicketFile = xsdTicketFile;
    }

    public void setXsdTicketsFile(String xsdTicketsFile) {
        this.xsdTicketsFile = xsdTicketsFile;
    }

    public void generateTickets(int toGenerateTickets, int playsPerTicket) {
        for (int i = 0; i < toGenerateTickets; i++) {
            lotteryTicketPool.getTicket().add(TicketTools.generateRandomTicket(this.nextTicketId, playsPerTicket));
            this.nextTicketId++;
        }
    }

    public int[] draw() {
        this.drawStatisticsArrayList.get(0).drawLottery(lotteryTicketPool, luckySuperStars, luckyNumbers, luckyStars);
        return this.drawStatisticsArrayList.get(0).getStatistics();
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

    /**
     * replace or add ticket pool (method will validate xml first! Check path to xsd-file!)
     *
     * @param xmlFile XML file with full path name e.g. /var/data/tickets.xml
     * @param replace if true then the new pool replaces the current pool
     */
    public void addXmlTickets(String xmlFile, Boolean replace) {
        try {
            TicketTools.validateXML(xsdTicketsFile, xmlFile);
            Tickets newlotteryTicketPool = Marshall.unMarshall(xmlFile);
            if (replace) {
                this.lotteryTicketPool = newlotteryTicketPool;
            } else {
                for (Tickets.Ticket tic : newlotteryTicketPool.getTicket()) {
                    tic.setTicketId(nextTicketId);
                    nextTicketId++;
                }
                this.lotteryTicketPool.getTicket().addAll(newlotteryTicketPool.getTicket());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("XML file not valid! Import failed!");
        }
    }

    public void writeTicketPoolToXml(String xmlFile) {
        Marshall.marshall(this.lotteryTicketPool, xmlFile);
    }

    public int getTotalTicketsInPool() {
        return this.lotteryTicketPool.getTicket().size();
    }

    public Tickets getLotteryTicketPool() {
        return lotteryTicketPool;
    }

    public int compareNumbers(Play play) {
        return drawStatisticsArrayList.get(0).compareNumbers(play, luckyNumbers);
    }

    public int compareStars(Play play) {
        return drawStatisticsArrayList.get(0).compareStars(play, luckyStars);
    }

    public int compareSuperStars(Ticket tic) {
        return drawStatisticsArrayList.get(0).compareSuperStars(tic, luckySuperStars);
    }

    public void printStats() {
        this.drawStatisticsArrayList.get(0).printStatistics();
    }
}
