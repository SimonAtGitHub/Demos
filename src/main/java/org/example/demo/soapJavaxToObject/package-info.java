@XmlSchema(
        namespace = "http://www.registar.com",
        xmlns = {
                @XmlNs(prefix = "SOAP-ENV", namespaceURI = "http://schemas.xmlsoap.org/soap/envelope/"),
                @XmlNs(prefix = "lij", namespaceURI = "http://www.learninjava.com/soaptoobject/1_0/"),
                @XmlNs(prefix = "lijcommon", namespaceURI = "http://www.learninjava.com/soaptoobject/1_1/")
        }
)
package org.example.demo.soapJavaxToObject;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;
