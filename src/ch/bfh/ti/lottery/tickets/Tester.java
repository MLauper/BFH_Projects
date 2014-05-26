package ch.bfh.ti.lottery.tickets;


/**
 * Created by alain on 24.05.14.
 */
public class Tester {

    public static void main(String[] args) {


        Tickets tickets = new Tickets();


        tickets.getTicket().add(TicketModifier.createNewTicket(0, 2, "2014-05-26 00:01"));

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
                TicketModifier.addPlay(tickets.getTicket().get(0), nums, stars) + " " +
                        TicketModifier.addPlay(tickets.getTicket().get(0), nums, stars)
        );

        TicketModifier.selectSuperStar(tickets.getTicket().get(0), 0, true);

        System.out.println(
                TicketModifier.setValidity(tickets.getTicket().get(0), 8)
        );

        System.out.println("end");

    }
}
