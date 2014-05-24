
package ch.bfh.ti.lottery.tickets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ticketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plays">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="7">
 *                   &lt;element name="play">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numbers">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="5" minOccurs="5">
 *                                       &lt;element name="number" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}numberType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="stars">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="2" minOccurs="2">
 *                                       &lt;element name="star" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}starType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="playId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="superStars">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="4" minOccurs="4">
 *                   &lt;element name="superStar">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.ti.bfh.ch/i1p/akz/schema/ticket>superStarType">
 *                           &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                           &lt;attribute name="superStarId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="validity" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}validityType"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketType", namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", propOrder = {
    "plays",
    "superStars",
    "validity",
    "dateTime"
})
@XmlSeeAlso({
    ch.bfh.ti.lottery.tickets.Tickets.Ticket.class,
    ch.bfh.ti.lottery.tickets.Ticket.class
})
public class TicketType {

    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
    protected TicketType.Plays plays;
    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
    protected TicketType.SuperStars superStars;
    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket")
    protected int validity;
    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    /**
     * Gets the value of the plays property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType.Plays }
     *     
     */
    public TicketType.Plays getPlays() {
        return plays;
    }

    /**
     * Sets the value of the plays property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType.Plays }
     *     
     */
    public void setPlays(TicketType.Plays value) {
        this.plays = value;
    }

    /**
     * Gets the value of the superStars property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType.SuperStars }
     *     
     */
    public TicketType.SuperStars getSuperStars() {
        return superStars;
    }

    /**
     * Sets the value of the superStars property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType.SuperStars }
     *     
     */
    public void setSuperStars(TicketType.SuperStars value) {
        this.superStars = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     */
    public int getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     */
    public void setValidity(int value) {
        this.validity = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="7">
     *         &lt;element name="play">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numbers">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="5" minOccurs="5">
     *                             &lt;element name="number" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}numberType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="stars">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="2" minOccurs="2">
     *                             &lt;element name="star" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}starType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="playId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "play"
    })
    public static class Plays {

        @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
        protected List<TicketType.Plays.Play> play;

        /**
         * Gets the value of the play property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the play property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketType.Plays.Play }
         * 
         * 
         */
        public List<TicketType.Plays.Play> getPlay() {
            if (play == null) {
                play = new ArrayList<TicketType.Plays.Play>();
            }
            return this.play;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="numbers">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="5" minOccurs="5">
         *                   &lt;element name="number" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}numberType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="stars">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="2" minOccurs="2">
         *                   &lt;element name="star" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}starType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="playId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numbers",
            "stars"
        })
        public static class Play {

            @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
            protected TicketType.Plays.Play.Numbers numbers;
            @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
            protected TicketType.Plays.Play.Stars stars;
            @XmlAttribute(name = "playId", required = true)
            protected int playId;

            /**
             * Gets the value of the numbers property.
             * 
             * @return
             *     possible object is
             *     {@link TicketType.Plays.Play.Numbers }
             *     
             */
            public TicketType.Plays.Play.Numbers getNumbers() {
                return numbers;
            }

            /**
             * Sets the value of the numbers property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketType.Plays.Play.Numbers }
             *     
             */
            public void setNumbers(TicketType.Plays.Play.Numbers value) {
                this.numbers = value;
            }

            /**
             * Gets the value of the stars property.
             * 
             * @return
             *     possible object is
             *     {@link TicketType.Plays.Play.Stars }
             *     
             */
            public TicketType.Plays.Play.Stars getStars() {
                return stars;
            }

            /**
             * Sets the value of the stars property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketType.Plays.Play.Stars }
             *     
             */
            public void setStars(TicketType.Plays.Play.Stars value) {
                this.stars = value;
            }

            /**
             * Gets the value of the playId property.
             * 
             */
            public int getPlayId() {
                return playId;
            }

            /**
             * Sets the value of the playId property.
             * 
             */
            public void setPlayId(int value) {
                this.playId = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence maxOccurs="5" minOccurs="5">
             *         &lt;element name="number" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}numberType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "number"
            })
            public static class Numbers {

                @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", type = Integer.class)
                protected List<Integer> number;

                /**
                 * Gets the value of the number property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the number property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNumber().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 * 
                 * 
                 */
                public List<Integer> getNumber() {
                    if (number == null) {
                        number = new ArrayList<Integer>();
                    }
                    return this.number;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence maxOccurs="2" minOccurs="2">
             *         &lt;element name="star" type="{http://www.ti.bfh.ch/i1p/akz/schema/ticket}starType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "star"
            })
            public static class Stars {

                @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", type = Integer.class)
                protected List<Integer> star;

                /**
                 * Gets the value of the star property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the star property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStar().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 * 
                 * 
                 */
                public List<Integer> getStar() {
                    if (star == null) {
                        star = new ArrayList<Integer>();
                    }
                    return this.star;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="4" minOccurs="4">
     *         &lt;element name="superStar">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.ti.bfh.ch/i1p/akz/schema/ticket>superStarType">
     *                 &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                 &lt;attribute name="superStarId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "superStar"
    })
    public static class SuperStars {

        @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
        protected List<TicketType.SuperStars.SuperStar> superStar;

        /**
         * Gets the value of the superStar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the superStar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuperStar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketType.SuperStars.SuperStar }
         * 
         * 
         */
        public List<TicketType.SuperStars.SuperStar> getSuperStar() {
            if (superStar == null) {
                superStar = new ArrayList<TicketType.SuperStars.SuperStar>();
            }
            return this.superStar;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.ti.bfh.ch/i1p/akz/schema/ticket>superStarType">
         *       &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="superStarId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class SuperStar {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "selected")
            protected Boolean selected;
            @XmlAttribute(name = "superStarId", required = true)
            protected int superStarId;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the selected property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isSelected() {
                if (selected == null) {
                    return false;
                } else {
                    return selected;
                }
            }

            /**
             * Sets the value of the selected property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSelected(Boolean value) {
                this.selected = value;
            }

            /**
             * Gets the value of the superStarId property.
             * 
             */
            public int getSuperStarId() {
                return superStarId;
            }

            /**
             * Sets the value of the superStarId property.
             * 
             */
            public void setSuperStarId(int value) {
                this.superStarId = value;
            }

        }

    }

}
