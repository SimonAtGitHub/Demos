package org.example;


import com.thoughtworks.xstream.XStream;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.example.pojo.*;


import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import java.util.List;

public class SoapXStreamExample {

    public static void main(String[] args) throws URISyntaxException {
        URL resourceUrl = SoapXStreamExample.class.getResource("/soap1.xml");
        String xmlString= readXmlToString(resourceUrl.getPath().substring(1));
        convertXmlToObject(xmlString);
    }

    public static void convertXmlToObject(String soapXml) {

        StaxDriver staxDriver = new StaxDriver();
        staxDriver.getInputFactory().setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, true);
        XStream xstream = new XStream(staxDriver);

        xstream.processAnnotations(SoapEnvelope.class);
//        xstream.processAnnotations(SoapHeader.class);
//        xstream.processAnnotations(LIJCommon.class);
//        xstream.processAnnotations(SoapBody.class);
//        xstream.processAnnotations(Response.class);
//        xstream.processAnnotations(Demographics.class);
//        xstream.processAnnotations(Country.class);
//        xstream.processAnnotations(State.class);

        SoapEnvelope envelope = (SoapEnvelope) xstream.fromXML(soapXml);

        // Now you can work with the deserialized object
        // For example, print the country name
        if (envelope.getBody().getResponse().getCountry() != null) {
            System.out.println("Country Name: " + envelope.getBody().getResponse().getCountry().getName());
        }
    }

    public static String readXmlToString(String path) {
        String xmlString = "";
        try {
            System.out.println(path);
            // Read the entire content of the file into a string
            xmlString = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);

            // Output the XML string to the console (optional)
            System.out.println(xmlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlString;
    }

}











