package org.example.demo.SoapXStream;


import com.thoughtworks.xstream.XStream;

import java.net.URISyntaxException;
import java.net.URL;

import com.thoughtworks.xstream.io.xml.StaxDriver;
import lombok.extern.slf4j.Slf4j;
import org.example.utils.FileUtils;


import javax.xml.stream.XMLInputFactory;

@Slf4j
public class SoapXStreamExample {

    public static void main(String[] args) throws URISyntaxException {
        URL resourceUrl = SoapXStreamExample.class.getResource("/soap.xml");
        String xmlString= FileUtils.readXmlToString(resourceUrl.getPath().substring(1));
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



}











