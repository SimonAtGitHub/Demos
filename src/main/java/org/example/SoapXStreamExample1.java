package org.example;


import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.QNameMap;
import com.thoughtworks.xstream.io.xml.StaxDriver;



class ContactDelData {

    private String contactId;
    private String roid;
    private String schemaLocation;
}

public class SoapXStreamExample1 {

    public static void main(String[] args){

        String xmlString = "<n:contactDelData \n" +
                "        xmlns:n=\"http://www.nominet.org.uk/epp/xml/std-notifications-1.2\" \n" +
                ">\n" +
                "<n:contactId> EPP-AB2345</n:contactId>\n" +
                "        <n:roid>1002703-UK </n:roid>\n" +
                "</n:contactDelData>";

        String namespaceURI="http://www.nominet.org.uk/epp/xml/std-notifications-1.2 std-notifications-1.2.xsd";
        String alias="n";
        String mappingObjName="contactDelData";
        Class response=ContactDelData.class;
        QNameMap qmap = new QNameMap();
        QName qname = new QName(namespaceURI, "alias", alias);
        qmap.registerMapping(qname, ContactDelData.class);

        StaxDriver staxDriver = new StaxDriver(qmap);
        XStream xstream2 = new XStream(staxDriver);
        xstream2.alias(mappingObjName, response);

        staxDriver.getInputFactory().setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, true);
        try {
            Object poll = xstream2.fromXML(xmlString);
            System.out.println(poll.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}