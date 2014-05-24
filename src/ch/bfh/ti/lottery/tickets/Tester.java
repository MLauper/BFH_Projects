package ch.bfh.ti.lottery.tickets;


import java.math.BigInteger;

/**
 * Created by alain on 24.05.14.
 */
public class Tester {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        ticket.setTicketId(0);

        TicketGregorianCalendar dateTime = new TicketGregorianCalendar();
        dateTime.setYear(2014);
        dateTime.setMonth(12);
        dateTime.setDay(22);
        dateTime.setHour(23);
        dateTime.setMinute(44);
        ticket.setDateTime(dateTime);

        TicketType.SuperStars.SuperStar superStar = new TicketType.SuperStars.SuperStar();
        superStar.setSuperStarId(0);
        superStar.setValue("AA12");
        ticket.getSuperStars().getSuperStar().add(superStar);
        ticket.getSuperStars().getSuperStar().add(superStar);
        ticket.getSuperStars().getSuperStar().add(superStar);
        ticket.getSuperStars().getSuperStar().add(superStar);

        ticket.setValidity(10);

        TicketType.Plays.Play play = new TicketType.Plays.Play();
        play.setPlayId(0);
        for (int i = 1; i < 6; i++) {
            play.getNumbers().getNumber().add(i);
        }
        for (int i = 1; i < 3; i++) {
            play.getStars().getStar().add(i);
        }
        ticket.getPlays().getPlay().add(play);
    }
}
