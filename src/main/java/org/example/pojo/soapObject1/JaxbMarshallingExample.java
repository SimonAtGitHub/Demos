package org.example.pojo.soapObject1;

import lombok.extern.slf4j.Slf4j;
import org.example.demo.SoapXStream.SoapXStreamExample;
import org.example.utils.FileUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.net.URL;


@Slf4j
public class JaxbMarshallingExample {
    public static void main(String[] args) {
        try {
            URL resourceUrl = SoapXStreamExample.class.getResource("/soap.xml");
            String xmlString= FileUtils.readXmlToString(resourceUrl.getPath().substring(1));

            // Create a JAXB context and marshaller
            JAXBContext context = JAXBContext.newInstance(SoapEnvelope.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            SoapEnvelope envelope = (SoapEnvelope) unmarshaller.unmarshal(new StringReader(xmlString));
            log.info("envelop:{}",envelope);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}