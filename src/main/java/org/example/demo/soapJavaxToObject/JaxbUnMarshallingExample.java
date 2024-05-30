package org.example.demo.soapJavaxToObject;

import lombok.extern.slf4j.Slf4j;
import org.example.demo.SoapXStream.SoapXStreamExample;
import org.example.utils.FileUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class JaxbUnMarshallingExample {
    public static void main(String[] args) {
        try {
            URL resourceUrl = SoapXStreamExample.class.getResource("/soap.xml");
            String xmlString= FileUtils.readXmlToString(resourceUrl.getPath().substring(1));

            JAXBContext context = JAXBContext.newInstance(SoapEnvelope.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            SoapEnvelope envelope = (SoapEnvelope) unmarshaller.unmarshal(new StringReader(xmlString));

            log.info("result is {}",envelope);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}