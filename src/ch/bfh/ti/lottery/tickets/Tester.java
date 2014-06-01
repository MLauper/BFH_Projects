package ch.bfh.ti.lottery.tickets;


/**
 * Created by alain on 24.05.14.
 */
public class Tester {

    public static void main(String[] args) {

        Tickets tickets = new Tickets();

        int toGenerateTickets = 100;
        int nextTicketId = 0;
        for (int i = 0; i < toGenerateTickets; i++) {
            tickets.getTicket().add(TicketTools.generateRandomTicket(nextTicketId, 7));
            nextTicketId++;
        }

        String xmlPath = "/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/tickets";
        String xmlFile = "lotteryTickets.xml";

        String xmlSchemaPath = "/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/tickets";
        String xmlSchmaFile = "tickets.xsd";

        //Marshall.marshall(tickets, xmlPath, xmlFile);
        Tickets newTic = Marshall.unMarshall(xmlPath, xmlFile);

        System.out.println("Validate:");


        try {
            TicketTools.validateXML(xmlSchemaPath, xmlSchmaFile, xmlPath, xmlFile);
            System.out.println("OK");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("not valid!");
        }
        System.out.println("End:");


    }
}
