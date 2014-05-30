
package ch.bfh.ti.lottery.tickets;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.bfh.ti.lottery.tickets package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.bfh.ti.lottery.tickets
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tickets }
     * 
     */
    public Tickets createTickets() {
        return new Tickets();
    }

    /**
     * Create an instance of {@link TicketType }
     * 
     */
    public TicketType createTicketType() {
        return new TicketType();
    }

    /**
     * Create an instance of {@link TicketType.SuperStars }
     * 
     */
    public TicketType.SuperStars createTicketTypeSuperStars() {
        return new TicketType.SuperStars();
    }

    /**
     * Create an instance of {@link TicketType.Plays }
     * 
     */
    public TicketType.Plays createTicketTypePlays() {
        return new TicketType.Plays();
    }

    /**
     * Create an instance of {@link TicketType.Plays.Play }
     * 
     */
    public TicketType.Plays.Play createTicketTypePlaysPlay() {
        return new TicketType.Plays.Play();
    }

    /**
     * Create an instance of {@link Tickets.Ticket }
     * 
     */
    public Tickets.Ticket createTicketsTicket() {
        return new Tickets.Ticket();
    }

    /**
     * Create an instance of {@link TicketType.TimeStamp }
     * 
     */
    public TicketType.TimeStamp createTicketTypeTimeStamp() {
        return new TicketType.TimeStamp();
    }

    /**
     * Create an instance of {@link TicketType.SuperStars.SuperStar }
     * 
     */
    public TicketType.SuperStars.SuperStar createTicketTypeSuperStarsSuperStar() {
        return new TicketType.SuperStars.SuperStar();
    }

    /**
     * Create an instance of {@link TicketType.Plays.Play.Numbers }
     * 
     */
    public TicketType.Plays.Play.Numbers createTicketTypePlaysPlayNumbers() {
        return new TicketType.Plays.Play.Numbers();
    }

    /**
     * Create an instance of {@link TicketType.Plays.Play.Stars }
     * 
     */
    public TicketType.Plays.Play.Stars createTicketTypePlaysPlayStars() {
        return new TicketType.Plays.Play.Stars();
    }

}
