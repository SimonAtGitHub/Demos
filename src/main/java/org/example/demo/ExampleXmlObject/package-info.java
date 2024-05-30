@XmlSchema(
        namespace = "http://www.registar.com",
        xmlns = {
                @XmlNs(prefix = "ts", namespaceURI = "http://www.registar.com"),
                @XmlNs(prefix = "ms", namespaceURI = "http://www.registar.com/ScoreVariant")
        }
)
package org.example.demo.ExampleXmlObject;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;