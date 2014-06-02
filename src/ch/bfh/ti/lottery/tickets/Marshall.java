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
        String xmlFile = pathToXML + File.separator + xmlFileName;
        marshall(tickets, xmlFile);
    }

    public static void marshall(Tickets tickets, String xmlFile) {
        try {
            JAXBContext context = JAXBContext.newInstance(Tickets.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //specify the location and name of xml file to be created
            File fileXml = new File(xmlFile);

            // Writing to XML file
            m.marshal(tickets, fileXml);

            // Writing to console (debugging only)
            //m.marshal(tickets, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Marshall a Object to an XML
     *
     * @param pathToXML   path in which XML can be found e.g. /var/data
     * @param xmlFileName XML file name e.g. tickets.xml
     * @return container of tickets
     */
    public static Tickets unMarshall(String pathToXML, String xmlFileName) {
        String xmlFile = pathToXML + File.separator + xmlFileName;
        return unMarshall(xmlFile);
    }

    /**
     * Marshall a Object to an XML
     *
     * @param xmlFile XML file with full path name e.g. /var/data/tickets.xml
     * @return container of tickets
     */
    public static Tickets unMarshall(String xmlFile) {
        Tickets ticketsFromXML = null;
        try {
            File file = new File(xmlFile);
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
