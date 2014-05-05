//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 04:05:03 PM CEST 
//


package ch.bfh.ti.quizduel.jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Question"/>
 *         &lt;element ref="{}Answer" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Category"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "question",
        "answer",
        "category"
})
@XmlRootElement(name = "Row")
public class Row {

    @XmlElement(name = "Question", required = true)
    protected String question;
    @XmlElement(name = "Answer", required = true)
    protected List<Answer> answer;
    @XmlElement(name = "Category", required = true)
    protected String category;

    /**
     * Gets the value of the question property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the answer property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answer property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnswer().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Answer }
     */
    public List<Answer> getAnswer() {
        if (answer == null) {
            answer = new ArrayList<Answer>();
        }
        return this.answer;
    }

    /**
     * Gets the value of the category property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
