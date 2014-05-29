package ch.bfh.ti.lottery.tickets;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by alain on 24.05.14.
 */
public class Tester {

    public static void main(String[] args) {


        Tickets tickets = new Tickets();


        tickets.getTicket().add(TicketTools.createNewTicket(0, 2, "2014-05-26 00:01"));

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
                TicketTools.addPlay(tickets.getTicket().get(0), nums, stars) + " " +
                        TicketTools.addPlay(tickets.getTicket().get(0), nums, stars)
        );

        TicketTools.selectSuperStar(tickets.getTicket().get(0), 0, true);

        System.out.println(
                TicketTools.setValidity(tickets.getTicket().get(0), 8)
        );


        JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        Marshaller m = null;
        try {
            m = jc.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        OutputStream os = null;
        try {
            os = new FileOutputStream( "test_tickets.xml" );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            m.marshal( tickets, os );
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }
}
