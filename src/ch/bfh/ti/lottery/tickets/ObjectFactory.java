
package ch.bfh.ti.lottery.tickets;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    private final static QName _Ticket_QNAME = new QName("http://www.ti.bfh.ch/i1p/akz/schema/ticket", "ticket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.bfh.ti.lottery.tickets
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Ticket.SuperStars }
     * 
     */
    public Ticket.SuperStars createTicketSuperStars() {
        return new Ticket.SuperStars();
    }

    /**
     * Create an instance of {@link Ticket.Plays }
     * 
     */
    public Ticket.Plays createTicketPlays() {
        return new Ticket.Plays();
    }

    /**
     * Create an instance of {@link Ticket.Plays.Play }
     * 
     */
    public Ticket.Plays.Play createTicketPlaysPlay() {
        return new Ticket.Plays.Play();
    }

    /**
     * Create an instance of {@link Ticket.Date }
     * 
     */
    public Ticket.Date createTicketDate() {
        return new Ticket.Date();
    }

    /**
     * Create an instance of {@link Ticket.Time }
     * 
     */
    public Ticket.Time createTicketTime() {
        return new Ticket.Time();
    }

    /**
     * Create an instance of {@link Ticket.SuperStars.SuperStar }
     * 
     */
    public Ticket.SuperStars.SuperStar createTicketSuperStarsSuperStar() {
        return new Ticket.SuperStars.SuperStar();
    }

    /**
     * Create an instance of {@link Ticket.Plays.Play.Numbers }
     * 
     */
    public Ticket.Plays.Play.Numbers createTicketPlaysPlayNumbers() {
        return new Ticket.Plays.Play.Numbers();
    }

    /**
     * Create an instance of {@link Ticket.Plays.Play.Stars }
     * 
     */
    public Ticket.Plays.Play.Stars createTicketPlaysPlayStars() {
        return new Ticket.Plays.Play.Stars();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", name = "ticket")
    public JAXBElement<Ticket> createTicket(Ticket value) {
        return new JAXBElement<Ticket>(_Ticket_QNAME, Ticket.class, null, value);
    }

}
