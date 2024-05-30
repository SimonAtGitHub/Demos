package org.example.demo;


import com.thoughtworks.xstream.XStream;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import lombok.extern.slf4j.Slf4j;
import org.example.pojo.*;


import javax.xml.stream.XMLInputFactory;

@Slf4j
public class SoapXStreamExample {

    public static void main(String[] args) throws URISyntaxException {
        URL resourceUrl = SoapXStreamExample.class.getResource("/soap.xml");
        String xmlString= readXmlToString(resourceUrl.getPath().substring(1));
        convertXmlToObject(xmlString);
    }

    public static SoapEnvelope convertXmlToObject(String soapXml) {

        StaxDriver staxDriver = new StaxDriver();
        staxDriver.getInputFactory().setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, true);
        XStream xstream = new XStream(staxDriver);

        xstream.processAnnotations(SoapEnvelope.class);
        SoapEnvelope envelope = (SoapEnvelope) xstream.fromXML(soapXml);
        log.info("envelop:{}",envelope);
        return envelope;

    }

    public static String readXmlToString(String path) {
        String xmlString = "";
        try {
            // Read the entire content of the file into a string
            xmlString = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);

            // Output the XML string to the console (optional)
            log.info(xmlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlString;
    }

}











