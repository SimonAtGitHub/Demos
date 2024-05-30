@XmlSchema(
        namespace = "http://www.registar.com",
        xmlns = {
                @XmlNs(prefix = "ts", namespaceURI = "http://www.example1.com"),
                @XmlNs(prefix = "ms", namespaceURI = "http://www.example2.com")
        }
)
package org.example.demo.ExampleXmlObject1;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;