
package ch.bfh.ti.lottery.tickets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *                                       &lt;element name="number" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}numberType"/>
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
 *                                       &lt;element name="star" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}starType"/>
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
 *                         &lt;extension base="&lt;https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType>superStarType">
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
 *         &lt;element name="validity" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}validityType"/>
 *         &lt;element name="drawn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeStamp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="month" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}monthType"/>
 *                   &lt;element name="day" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}dayType"/>
 *                   &lt;element name="hour" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}hourType"/>
 *                   &lt;element name="minute" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}minuteType"/>
 *                   &lt;element name="second" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}secondType"/>
 *                   &lt;element name="milSecond" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}milSecondsType"/>
 *                   &lt;element name="timeZoneOffset" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}timeZoneOffsetType"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ticketType", namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", propOrder = {
    "plays",
    "superStars",
    "validity",
    "drawn",
    "timeStamp"
})
@XmlSeeAlso({
    ch.bfh.ti.lottery.tickets.Tickets.Ticket.class
})
public class TicketType {

    @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", required = true)
    protected TicketType.Plays plays;
    @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", required = true)
    protected TicketType.SuperStars superStars;
    @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
    protected int validity;
    @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", defaultValue = "0")
    protected int drawn;
    @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", required = true)
    protected TicketType.TimeStamp timeStamp;

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
     * Gets the value of the drawn property.
     * 
     */
    public int getDrawn() {
        return drawn;
    }

    /**
     * Sets the value of the drawn property.
     * 
     */
    public void setDrawn(int value) {
        this.drawn = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType.TimeStamp }
     *     
     */
    public TicketType.TimeStamp getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType.TimeStamp }
     *     
     */
    public void setTimeStamp(TicketType.TimeStamp value) {
        this.timeStamp = value;
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
     *                             &lt;element name="number" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}numberType"/>
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
     *                             &lt;element name="star" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}starType"/>
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

        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", required = true)
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
         *                   &lt;element name="number" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}numberType"/>
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
         *                   &lt;element name="star" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}starType"/>
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

            @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", required = true)
            protected TicketType.Plays.Play.Numbers numbers;
            @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", required = true)
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
             *         &lt;element name="number" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}numberType"/>
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

                @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", type = Integer.class)
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
             *         &lt;element name="star" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}starType"/>
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

                @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", type = Integer.class)
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
     *               &lt;extension base="&lt;https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType>superStarType">
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

        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType", required = true)
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
         *     &lt;extension base="&lt;https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType>superStarType">
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
     *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="month" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}monthType"/>
     *         &lt;element name="day" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}dayType"/>
     *         &lt;element name="hour" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}hourType"/>
     *         &lt;element name="minute" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}minuteType"/>
     *         &lt;element name="second" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}secondType"/>
     *         &lt;element name="milSecond" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}milSecondsType"/>
     *         &lt;element name="timeZoneOffset" type="{https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType}timeZoneOffsetType"/>
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
        "year",
        "month",
        "day",
        "hour",
        "minute",
        "second",
        "milSecond",
        "timeZoneOffset"
    })
    public static class TimeStamp {

        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
        protected int year;
        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
        protected int month;
        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
        protected int day;
        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
        protected int hour;
        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
        protected int minute;
        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
        protected int second;
        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
        protected int milSecond;
        @XmlElement(namespace = "https://raw.githubusercontent.com/akeusen/BFH_Projects/master/src/ch/bfh/ti/lottery/tickets/ticketType")
        protected int timeZoneOffset;

        /**
         * Gets the value of the year property.
         * 
         */
        public int getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         */
        public void setYear(int value) {
            this.year = value;
        }

        /**
         * Gets the value of the month property.
         * 
         */
        public int getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         * 
         */
        public void setMonth(int value) {
            this.month = value;
        }

        /**
         * Gets the value of the day property.
         * 
         */
        public int getDay() {
            return day;
        }

        /**
         * Sets the value of the day property.
         * 
         */
        public void setDay(int value) {
            this.day = value;
        }

        /**
         * Gets the value of the hour property.
         * 
         */
        public int getHour() {
            return hour;
        }

        /**
         * Sets the value of the hour property.
         * 
         */
        public void setHour(int value) {
            this.hour = value;
        }

        /**
         * Gets the value of the minute property.
         * 
         */
        public int getMinute() {
            return minute;
        }

        /**
         * Sets the value of the minute property.
         * 
         */
        public void setMinute(int value) {
            this.minute = value;
        }

        /**
         * Gets the value of the second property.
         * 
         */
        public int getSecond() {
            return second;
        }

        /**
         * Sets the value of the second property.
         * 
         */
        public void setSecond(int value) {
            this.second = value;
        }

        /**
         * Gets the value of the milSecond property.
         * 
         */
        public int getMilSecond() {
            return milSecond;
        }

        /**
         * Sets the value of the milSecond property.
         * 
         */
        public void setMilSecond(int value) {
            this.milSecond = value;
        }

        /**
         * Gets the value of the timeZoneOffset property.
         * 
         */
        public int getTimeZoneOffset() {
            return timeZoneOffset;
        }

        /**
         * Sets the value of the timeZoneOffset property.
         * 
         */
        public void setTimeZoneOffset(int value) {
            this.timeZoneOffset = value;
        }

    }

}
