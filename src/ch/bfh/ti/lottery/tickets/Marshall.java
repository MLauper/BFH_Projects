package ch.bfh.ti.lottery.tickets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by alain on 29.05.14.
 */
public class Marshall {

    /**
     * Marshall a Object to an XML
     *
     * @param pathToXML   path in which XML should be stored e.g. /var/data
     * @param xmlFileName XML file name e.g. tickets.xml
     */
    public static void marshall(Tickets tickets, String pathToXML, String xmlFileName) {

        try {
            JAXBContext context = JAXBContext.newInstance(Tickets.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //specify the location and name of xml file to be created
            File xmlFile = new File(pathToXML + File.separator + xmlFileName);

            // Writing to XML file
            m.marshal(tickets, xmlFile);

            // Writing to console
            m.marshal(tickets, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Marshall a Object to an XML
     *
     * @param pathToXML   path in which XML can be found e.g. /var/data
     * @param xmlFileName XML file name e.g. tickets.xml
     */
    public static Tickets unMarshall(String pathToXML, String xmlFileName) {

        Tickets ticketsFromXML = null;
        try {
            File file = new File(pathToXML + File.separator + xmlFileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(Tickets.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ticketsFromXML = (Tickets) jaxbUnmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            // some exception occured
            e.printStackTrace();
        }
        return ticketsFromXML;
    }

}
