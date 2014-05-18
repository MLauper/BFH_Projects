
package ch.bfh.ti.lottery.tickets;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ticket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticket">
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
 *                                       &lt;element name="number">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;minInclusive value="1"/>
 *                                             &lt;maxInclusive value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                                       &lt;element name="star">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;minInclusive value="1"/>
 *                                             &lt;maxInclusive value="11"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="playId" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
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
 *                         &lt;extension base="&lt;http://www.ti.bfh.ch/i1p/akz/schema/ticket>restrictedSuperStarString">
 *                           &lt;attribute name="superStarId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valitity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="year">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1901"/>
 *                         &lt;maxInclusive value="2099"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="month">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                         &lt;maxInclusive value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="day">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                         &lt;maxInclusive value="31"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="time">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hour">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="23"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="minute">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="59"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="second">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="59"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="tickedId" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticket", namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", propOrder = {
    "plays",
    "superStars",
    "valitity",
    "date",
    "time"
})
public class Ticket {

    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
    protected Ticket.Plays plays;
    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
    protected Ticket.SuperStars superStars;
    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
    protected BigInteger valitity;
    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
    protected Ticket.Date date;
    @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
    protected Ticket.Time time;
    @XmlAttribute(name = "tickedId")
    protected BigInteger tickedId;

    /**
     * Gets the value of the plays property.
     * 
     * @return
     *     possible object is
     *     {@link Ticket.Plays }
     *     
     */
    public Ticket.Plays getPlays() {
        return plays;
    }

    /**
     * Sets the value of the plays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket.Plays }
     *     
     */
    public void setPlays(Ticket.Plays value) {
        this.plays = value;
    }

    /**
     * Gets the value of the superStars property.
     * 
     * @return
     *     possible object is
     *     {@link Ticket.SuperStars }
     *     
     */
    public Ticket.SuperStars getSuperStars() {
        return superStars;
    }

    /**
     * Sets the value of the superStars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket.SuperStars }
     *     
     */
    public void setSuperStars(Ticket.SuperStars value) {
        this.superStars = value;
    }

    /**
     * Gets the value of the valitity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValitity() {
        return valitity;
    }

    /**
     * Sets the value of the valitity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValitity(BigInteger value) {
        this.valitity = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Ticket.Date }
     *     
     */
    public Ticket.Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket.Date }
     *     
     */
    public void setDate(Ticket.Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Ticket.Time }
     *     
     */
    public Ticket.Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket.Time }
     *     
     */
    public void setTime(Ticket.Time value) {
        this.time = value;
    }

    /**
     * Gets the value of the tickedId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTickedId() {
        if (tickedId == null) {
            return new BigInteger("0");
        } else {
            return tickedId;
        }
    }

    /**
     * Sets the value of the tickedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTickedId(BigInteger value) {
        this.tickedId = value;
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
     *         &lt;element name="year">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1901"/>
     *               &lt;maxInclusive value="2099"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="month">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *               &lt;maxInclusive value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="day">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *               &lt;maxInclusive value="31"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "year",
        "month",
        "day"
    })
    public static class Date {

        @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket")
        protected int year;
        @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket")
        protected int month;
        @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket")
        protected int day;

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
     *                             &lt;element name="number">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;minInclusive value="1"/>
     *                                   &lt;maxInclusive value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
     *                             &lt;element name="star">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;minInclusive value="1"/>
     *                                   &lt;maxInclusive value="11"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="playId" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
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
        protected List<Ticket.Plays.Play> play;

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
         * {@link Ticket.Plays.Play }
         * 
         * 
         */
        public List<Ticket.Plays.Play> getPlay() {
            if (play == null) {
                play = new ArrayList<Ticket.Plays.Play>();
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
         *                   &lt;element name="number">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;minInclusive value="1"/>
         *                         &lt;maxInclusive value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
         *                   &lt;element name="star">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;minInclusive value="1"/>
         *                         &lt;maxInclusive value="11"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="playId" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
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
            protected Ticket.Plays.Play.Numbers numbers;
            @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket", required = true)
            protected Ticket.Plays.Play.Stars stars;
            @XmlAttribute(name = "playId")
            protected BigInteger playId;

            /**
             * Gets the value of the numbers property.
             * 
             * @return
             *     possible object is
             *     {@link Ticket.Plays.Play.Numbers }
             *     
             */
            public Ticket.Plays.Play.Numbers getNumbers() {
                return numbers;
            }

            /**
             * Sets the value of the numbers property.
             * 
             * @param value
             *     allowed object is
             *     {@link Ticket.Plays.Play.Numbers }
             *     
             */
            public void setNumbers(Ticket.Plays.Play.Numbers value) {
                this.numbers = value;
            }

            /**
             * Gets the value of the stars property.
             * 
             * @return
             *     possible object is
             *     {@link Ticket.Plays.Play.Stars }
             *     
             */
            public Ticket.Plays.Play.Stars getStars() {
                return stars;
            }

            /**
             * Sets the value of the stars property.
             * 
             * @param value
             *     allowed object is
             *     {@link Ticket.Plays.Play.Stars }
             *     
             */
            public void setStars(Ticket.Plays.Play.Stars value) {
                this.stars = value;
            }

            /**
             * Gets the value of the playId property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPlayId() {
                if (playId == null) {
                    return new BigInteger("0");
                } else {
                    return playId;
                }
            }

            /**
             * Sets the value of the playId property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPlayId(BigInteger value) {
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
             *         &lt;element name="number">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;minInclusive value="1"/>
             *               &lt;maxInclusive value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
             *         &lt;element name="star">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;minInclusive value="1"/>
             *               &lt;maxInclusive value="11"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
     *               &lt;extension base="&lt;http://www.ti.bfh.ch/i1p/akz/schema/ticket>restrictedSuperStarString">
     *                 &lt;attribute name="superStarId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
        protected List<Ticket.SuperStars.SuperStar> superStar;

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
         * {@link Ticket.SuperStars.SuperStar }
         * 
         * 
         */
        public List<Ticket.SuperStars.SuperStar> getSuperStar() {
            if (superStar == null) {
                superStar = new ArrayList<Ticket.SuperStars.SuperStar>();
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
         *     &lt;extension base="&lt;http://www.ti.bfh.ch/i1p/akz/schema/ticket>restrictedSuperStarString">
         *       &lt;attribute name="superStarId" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
            @XmlAttribute(name = "superStarId")
            protected BigInteger superStarId;
            @XmlAttribute(name = "selected")
            protected Boolean selected;

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
             * Gets the value of the superStarId property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSuperStarId() {
                return superStarId;
            }

            /**
             * Sets the value of the superStarId property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSuperStarId(BigInteger value) {
                this.superStarId = value;
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
     *         &lt;element name="hour">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="23"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="minute">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="59"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="second">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="59"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "hour",
        "minute",
        "second"
    })
    public static class Time {

        @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket")
        protected int hour;
        @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket")
        protected int minute;
        @XmlElement(namespace = "http://www.ti.bfh.ch/i1p/akz/schema/ticket")
        protected int second;

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

    }

}
