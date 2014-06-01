package ch.bfh.ti.lottery.tickets;


/**
 * Created by alain on 24.05.14.
 */
public class Tester {

    public static void main(String[] args) {


        Tickets tickets = new Tickets();


        tickets.getTicket().add(TicketTools.createNewTicket(0));
        tickets.getTicket().add(TicketTools.createNewTicket(1));

        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        int[] stars = new int[2];
        stars[0] = 1;
        stars[1] = 2;

        System.out.println(
                TicketTools.addPlay(tickets.getTicket().get(0), nums, stars) +
                        " " +
                        TicketTools.addPlay(tickets.getTicket().get(0), nums, stars)
        );
        System.out.println(
                TicketTools.addPlay(tickets.getTicket().get(1), nums, stars) +
                        " " +
                        TicketTools.addPlay(tickets.getTicket().get(1), nums, stars)
        );

        TicketTools.selectSuperStar(tickets.getTicket().get(0), 0, true);
        TicketTools.selectSuperStar(tickets.getTicket().get(1), 3, true);

        System.out.println(
                TicketTools.setValidity(tickets.getTicket().get(0), 8) + " " +
                        TicketTools.setValidity(tickets.getTicket().get(1), 10)
        );


        String xmlPath = "/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/tickets";
        String xmlFile = "lotteryTickets.xml";

        String xmlSchemaPath = "/Users/alain/Documents/GitHub/BFH/projects/src/ch/bfh/ti/lottery/tickets";
        String xmlSchmaFile = "tickets.xsd";

        Marshall.marshall(tickets, xmlPath, xmlFile);
        Tickets newTic = Marshall.unMarshall(xmlPath, xmlFile);


        System.out.println("Validate:");
        System.out.println(TicketTools.validateXML(xmlSchemaPath, xmlSchmaFile, xmlPath, xmlFile));
        System.out.println("End:");


    }
}
