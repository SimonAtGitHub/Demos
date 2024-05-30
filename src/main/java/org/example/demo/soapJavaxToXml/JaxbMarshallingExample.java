package org.example.demo.soapJavaxToXml;

import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class JaxbMarshallingExample {
    public static void main(String[] args) {
        try {

            // Create a JAXB context and marshaller
            JAXBContext context = JAXBContext.newInstance(SoapEnvelope.class);
            Marshaller marshaller = context.createMarshaller();
            SoapEnvelope envelope = new SoapEnvelope();
            List<State> states = new ArrayList<>();
            states.add(new State("1","STATE1","code1"));
            states.add(new State("2","STATE2","code2"));
            envelope.setBody(new SoapBody(new Response(new Country("CN","Asia","CHINA",states),new Demographics("Beijing","CHN","Chinese"))));
            envelope.setHeader(new SoapHeader(new LIJHeader("countrydetails","123432434234","1.2")));
            // Optionally, you can format the output to be more readable
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Marshal the object to XML
            StringWriter writer = new StringWriter();
            marshaller.marshal(envelope, writer);

            // Output the XML
            System.out.println(writer.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}