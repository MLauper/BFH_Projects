package ch.bfh.ti.lottery.tickets;

import java.math.BigInteger;

/**
 * Created by alain on 24.05.14.
 */
public class TicketModifier {


    public TicketModifier() {
    }

    /**
     * Constructor
     * @param ticketId Ticket ID
     * @param ticketValidity
     * @param timeStamp in format JJJJ-MM-DD-hh-mm e.g.: 2014-11-23-14-56
     */
    public Ticket createNewTicket(int ticketId, int ticketValidity, String timeStamp){
        Ticket ticket = new Ticket();
        ticket.setTicketId(0);

        TicketGregorianCalendar dateTime = new TicketGregorianCalendar();
        dateTime.setYear(2014);
        dateTime.setMonth(12);
        dateTime.setDay(22);
        dateTime.setHour(23);
        dateTime.setMinute(44);
        ticket.setDateTime(dateTime);

        return null;
    }


}
