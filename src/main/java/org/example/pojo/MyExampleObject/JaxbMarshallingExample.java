package org.example.pojo.MyExampleObject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class JaxbMarshallingExample {
    public static void main(String[] args) {
        try {
            // Create an instance of your object
            MyObject myObject = new MyObject();
            myObject.setName("name1234");
            myObject.setScoreVariant("score1234");

            // Create a JAXB context and marshaller
            JAXBContext context = JAXBContext.newInstance(MyObject.class);
            Marshaller marshaller = context.createMarshaller();

            // Optionally, you can format the output to be more readable
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Marshal the object to XML
            StringWriter writer = new StringWriter();
            marshaller.marshal(myObject, writer);

            // Output the XML
            System.out.println(writer.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}