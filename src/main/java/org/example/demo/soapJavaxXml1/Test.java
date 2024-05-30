package org.example.demo.soapJavaxXml1;

import lombok.extern.slf4j.Slf4j;
import org.example.demo.SoapXStream.SoapXStreamExample;
import org.example.utils.FileUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.net.URL;

@Slf4j
public class Test {
    public static void main(String[] args) {
        try {
            URL resourceUrl = SoapXStreamExample.class.getResource("/soap.xml");
            String xmlString= FileUtils.readXmlToString(resourceUrl.getPath().substring(1));

            JAXBContext context = JAXBContext.newInstance(SOAPEnvelope.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            SOAPEnvelope envelope = (SOAPEnvelope) unmarshaller.unmarshal(new StringReader(xmlString));
            log.info("result is {}",envelope);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
