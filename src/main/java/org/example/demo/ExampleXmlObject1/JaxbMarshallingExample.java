package org.example.demo.ExampleXmlObject1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class JaxbMarshallingExample {
    public static void main(String[] args) {
        try {
            // Create an instance of your object
            MyObject myObject = new MyObject();
            myObject.setAttr1("attr123");
            myObject.setTest("test");
            List<Item> items = new ArrayList<>();
            items.add(new Item("1","item1","10kg"));
            items.add(new Item("2","item2","20kg"));
            myObject.setItems(items);

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