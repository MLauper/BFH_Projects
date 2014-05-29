package ch.bfh.ti.lottery.tickets;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by alain on 24.05.14.
 */
public class Tester {

    public static void main(String[] args) {


        Tickets tickets = new Tickets();


        tickets.getTicket().add(TicketTools.createNewTicket(0));

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

        TicketTools.selectSuperStar(tickets.getTicket().get(0), 0, true);

        System.out.println(
                TicketTools.setValidity(tickets.getTicket().get(0), 8)
        );



        Marshall.marshall(tickets,"/Users/alain/Desktop/tmp_bfh", "tickets.xml");

        Tickets newTic = Marshall.unMarshall("/Users/alain/Desktop/tmp_bfh", "tickets.xml");


        System.out.println("Validate:");
        System.out.println(TicketTools.validateTickets());

    }
}
