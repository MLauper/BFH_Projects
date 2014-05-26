package ch.bfh.ti.lottery.tickets;

import java.util.Random;

/**
 * Created by alain on 24.05.14.
 */
public class TicketModifier {


    public TicketModifier() {
    }

    /**
     * Creates and returns a new ticket
     *
     * @param ticketId       Ticket ID
     * @param ticketValidity for how many draws the ticket is valid
     * @param timeStamp      in format "JJJJ-MM-DD hh:mm" e.g.: "2014-11-23 14:56"
     */
    public static Tickets.Ticket createNewTicket(int ticketId, int ticketValidity, String timeStamp) {


        Tickets.Ticket ticket = new Tickets.Ticket();
        ticket.setTicketId(ticketId);

        TicketGregorianCalendar dateTime = new TicketGregorianCalendar();
        dateTime.setYear(2014);
        dateTime.setMonth(12);
        dateTime.setDay(22);
        dateTime.setHour(23);
        dateTime.setMinute(44);
        ticket.setDateTime(dateTime);

        TicketType.SuperStars newSuperStars = createSuperStar();

        ticket.setSuperStars(newSuperStars);

        ticket.setValidity(ticketValidity);

        return ticket;
    }

    private static TicketType.SuperStars createSuperStar() {
        TicketType.SuperStars newSuperStarsList = new TicketType.SuperStars();

        int nextSuperStarId = 0;
        for (int i = 0; i < 4; i++) {
            TicketType.SuperStars.SuperStar newSuperStar = new TicketType.SuperStars.SuperStar();
            String newSuperStarString = "";

            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String nums = "0123456789";

            int a = alphabet.length();
            int n = nums.length();

            Random r = new Random();

            newSuperStarString += String.valueOf(alphabet.charAt(r.nextInt(a)));
            newSuperStarString += String.valueOf(nums.charAt(r.nextInt(n)));
            newSuperStarString += String.valueOf(nums.charAt(r.nextInt(n)));
            newSuperStarString += String.valueOf(nums.charAt(r.nextInt(n)));
            newSuperStarString += String.valueOf(alphabet.charAt(r.nextInt(a)));

            newSuperStar.setSelected(false);
            newSuperStar.setSuperStarId(nextSuperStarId);
            newSuperStar.setValue(newSuperStarString);

            newSuperStarsList.getSuperStar().add(newSuperStar);

            nextSuperStarId++;
        }
        return newSuperStarsList;
    }

    /**
     * adds a play to a ticket
     *
     * @param ticket  Ticket to modify
     * @param numbers int array of lottery numbers
     * @param stars   int array of lottery stars
     */
    public static boolean addPlay(Tickets.Ticket ticket, int numbers[], int stars[]) {

        boolean isNumbersValid = false;
        int counterNumbersDuplicates = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if (numbers[i] == numbers[j]) {
                        counterNumbersDuplicates++;
                    }
                }
            }
        }
        if (counterNumbersDuplicates < 1) {
            isNumbersValid = true;
        }

        boolean isStarsValid = false;
        int counterStarsDuplicates = 0;
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars.length; j++) {
                if (i != j) {
                    if (stars[i] == stars[j]) {
                        counterStarsDuplicates++;
                    }
                }
            }
        }
        if (counterStarsDuplicates < 1) {
            isStarsValid = true;
        }

        int playsSize;
        if (ticket.getPlays() == null) {
            playsSize = 0;
        } else {
            playsSize = ticket.getPlays().getPlay().size();
        }

        if (playsSize > 6 || numbers.length != 5 || stars.length != 2 || !isNumbersValid || !isStarsValid) {
            // ticket can't hold more than 7 plays!
            // numbers array must have size of 5
            // stars array must have size of 2
            // numbers must be valid
            // starts must be valid
            return false;
        } else {

            if (ticket.getPlays() == null) {
                ticket.setPlays(new Tickets.Ticket.Plays());
            }

            int nextPlayId;
            if (ticket.getPlays() == null) {
                nextPlayId = 0;
            } else {
                nextPlayId = ticket.getPlays().getPlay().size();
            }


            Ticket.Plays.Play newPlay = new Ticket.Plays.Play();

            newPlay.setPlayId(nextPlayId);

            Ticket.Plays.Play.Numbers newNumbers = new TicketType.Plays.Play.Numbers();
            for (int i = 0; i < numbers.length; i++) {
                newNumbers.getNumber().add(numbers[i]);
                //play.getNumbers().getNumber().add(numbers[i]);
            }

            Ticket.Plays.Play.Stars newStars = new TicketType.Plays.Play.Stars();
            for (int i = 0; i < stars.length; i++) {
                newStars.getStar().add(stars[i]);
            }

            newPlay.setNumbers(newNumbers);
            newPlay.setStars(newStars);

            ticket.getPlays().getPlay().add(newPlay);
            return true;
        }
    }

    /**
     * modify a play
     *
     * @param ticket Ticket to modify
     */
    public static boolean setNumbersOfPlay(Tickets.Ticket ticket, int playId, int numbers[], int stars[]) {


        return false;
    }

    /**
     * select or un-select SuperStar
     *
     * @param ticket      Ticket to modify
     * @param superStarId SuperStar ID {0-3}
     * @param selected    SuperStar selected true|false
     */
    public static void selectSuperStar(Tickets.Ticket ticket, int superStarId, boolean selected) {
        ticket.getSuperStars().getSuperStar().get(superStarId).setSelected(selected);
    }

    /**
     * set ticket validity
     *
     * @param ticket Ticket to modify
     */
    public static boolean setValidity(Tickets.Ticket ticket, int validity) {

        if (validity == 1 || validity == 2 || validity == 4 || validity == 6 || validity == 8 || validity == 10) {
            ticket.setValidity(validity);
            return true;
        } else {
            return false;
        }
    }
}
