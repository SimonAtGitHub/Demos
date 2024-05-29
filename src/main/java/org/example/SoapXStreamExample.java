package org.example;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.QNameMap;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import lombok.Data;
import org.example.pojo.*;


import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import java.util.List;

public class SoapXStreamExample {


    // Deserialize the SOAP XML to Java object
    public static final String soapXml = "<Envelope >\n" +
            "    <Header>\n" +
            "        <lijcommon MsgID=\"3d1b0586-6c79-4f53-b418-982a0cd2e51c\"\n" +
            "                             Timestamp=\"Sun Aug 23 00:12:31 CDT 2020\" Version=\"1.0\"/>\n" +
            "    </Header>\n" +
            "    <Body>\n" +
            "        <Response>\n" +
            "            <Country Code=\"1\" Continent=\"NA\" Name=\"US\">\n" +
            "                <State Code=\"713\" Name=\"Texas\" StateCode=\"TX\"/>\n" +
            "                <State Code=\"678\" Name=\"Georgia\" StateCode=\"GA\"/>\n" +
            "                <State Code=\"480\" Name=\"Arizona\" StateCode=\"AZ\"/>\n" +
            "            </Country>\n" +
            "            <Demographics Capital=\"Washington\" Currency=\"Dollar\" Language=\"English\"/>\n" +
            "        </Response>\n" +
            "    </Body>\n" +
            "</Envelope>";

    public static void main(String[] args) {

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

        // Serialize the Java object back to SOAP XML
        String xmlOutput = xstream.toXML(envelope);
        System.out.println(xmlOutput);
    }
}











