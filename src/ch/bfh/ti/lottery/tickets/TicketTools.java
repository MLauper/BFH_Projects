package ch.bfh.ti.lottery.tickets;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by alain on 24.05.14.
 */
public class TicketTools {


    public TicketTools() {
    }

    /**
     * Creates and returns a new ticket
     *
     * @param ticketId Ticket ID
     */
    public static Tickets.Ticket createNewTicket(int ticketId) {


        Tickets.Ticket ticket = new Tickets.Ticket();
        ticket.setTicketId(ticketId);

        ticket.setTimeStamp(getCurrentTimeStamp());

        Tickets.Ticket.SuperStars newSuperStars = createSuperStar();

        ticket.setSuperStars(newSuperStars);

        ticket.setValidity(1);

        return ticket;
    }

    private static Tickets.Ticket.SuperStars createSuperStar() {
        Tickets.Ticket.SuperStars newSuperStarsList = new Tickets.Ticket.SuperStars();

        int nextSuperStarId = 0;
        for (int i = 0; i < 4; i++) {
            Tickets.Ticket.SuperStars.SuperStar newSuperStar = new Tickets.Ticket.SuperStars.SuperStar();
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


            Tickets.Ticket.Plays.Play newPlay = new Tickets.Ticket.Plays.Play();

            newPlay.setPlayId(nextPlayId);

            Tickets.Ticket.Plays.Play.Numbers newNumbers = new Tickets.Ticket.Plays.Play.Numbers();
            for (int i = 0; i < numbers.length; i++) {
                newNumbers.getNumber().add(numbers[i]);
                //play.getNumbers().getNumber().add(numbers[i]);
            }

            Tickets.Ticket.Plays.Play.Stars newStars = new Tickets.Ticket.Plays.Play.Stars();
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

    public static void validateXML(String inXmlSchemaPath, String inXmlSchmaFileName, String inXmlPath, String inXmlFileName)
            throws SAXException {

        String inXmlSchema = inXmlSchemaPath + File.separator + inXmlSchmaFileName;
        String inXmlFile = inXmlPath + File.separator + inXmlFileName;

        validateXML(inXmlSchema, inXmlFile);
    }

    public static void validateXML(String inXmlSchema, String inXmlFile)
            throws SAXException {

        File xsdFile = new File(inXmlSchema);
        File xmlFile = new File(inXmlFile);

        InputStream xsd = null;
        try {
            xsd = new FileInputStream(xsdFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        InputStream xml = null;
        try {
            xml = new FileInputStream(xmlFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Validator validator = null;
        StreamSource streamSource = null;
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            factory.setResourceResolver(new ResourceResolver());
            Schema schema = factory.newSchema(new StreamSource(xsd));
            validator = schema.newValidator();
            streamSource = new StreamSource(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            validator.validate(streamSource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * get current system time stamp
     *
     * @return current time stamp
     */
    public static Tickets.Ticket.TimeStamp getCurrentTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS").format(Calendar.getInstance().getTime());

        Tickets.Ticket.TimeStamp newTimeStamp = new Tickets.Ticket.TimeStamp();
        newTimeStamp.setYear(Integer.parseInt(timeStamp.substring(0, 4)));
        newTimeStamp.setMonth(Integer.parseInt(timeStamp.substring(5, 7)));
        newTimeStamp.setDay(Integer.parseInt(timeStamp.substring(8, 10)));
        newTimeStamp.setHour(Integer.parseInt(timeStamp.substring(11, 13)));
        newTimeStamp.setMinute(Integer.parseInt(timeStamp.substring(14, 16)));
        newTimeStamp.setSecond(Integer.parseInt(timeStamp.substring(17, 19)));
        newTimeStamp.setMilSecond(Integer.parseInt(timeStamp.substring(20, 23)));
        newTimeStamp.setTimeZoneOffset(2);

        return newTimeStamp;
    }

    /**
     * sets current time to ticket
     *
     * @param ticket
     */
    public static void setTimeStamp(Tickets.Ticket ticket) {
        ticket.setTimeStamp(getCurrentTimeStamp());
    }

    /**
     * sets specific TimeStamp Class to ticket
     *
     * @param ticket
     * @param timeStamp
     */
    public static void setTimeStamp(Tickets.Ticket ticket, Tickets.Ticket.TimeStamp timeStamp) {
        ticket.setTimeStamp(timeStamp);
    }

    public static Tickets.Ticket generateRandomTicket(int nextTicketId, int totalOfPlaysPerTicket) {

        Tickets.Ticket newTicket = createNewTicket(nextTicketId);

        int[] numPool = new int[50];
        for (int i = 0; i < numPool.length; i++) {
            numPool[i] = i + 1;
        }

        int[] starPool = new int[11];
        for (int i = 0; i < starPool.length; i++) {
            starPool[i] = i + 1;
        }

        Random random = new Random();

        for (int j = 0; j < totalOfPlaysPerTicket; j++) {

            int[] newNums = new int[5];
            for (int i = 0; i < newNums.length; i++) {
                int nextNum = -1;

                Boolean unique = false;
                while (!unique) {
                    nextNum = random.nextInt(numPool.length);

                    if (nextNum != newNums[0] &&
                            nextNum != newNums[1] &&
                            nextNum != newNums[2] &&
                            nextNum != newNums[3] &&
                            nextNum != newNums[4]) {
                        unique = true;
                    }
                }
                if (nextNum != -1) {
                    newNums[i] = nextNum;
                }
            }

            int[] newStars = new int[2];
            for (int i = 0; i < newStars.length; i++) {
                int nextNum = -1;

                Boolean unique = false;
                while (!unique) {
                    nextNum = random.nextInt(starPool.length);

                    if (nextNum != newStars[0] && nextNum != newStars[1]) {
                        unique = true;
                    }
                }
                if (nextNum != -1) {
                    newStars[i] = nextNum;
                }
            }
            addPlay(newTicket, newNums, newStars);
        }


        int[] superStarSelector = {0, 1, 2, 3};
        selectSuperStar(newTicket, random.nextInt(superStarSelector.length), true);

        int[] enumValidity = {1, 2, 4, 6, 8, 10};
        setValidity(newTicket, random.nextInt(enumValidity.length));

        return newTicket;
    }


}
