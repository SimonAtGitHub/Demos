package org.example.demo.soapJavaxXml1;
import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;

@ToString
@XmlRootElement(namespace = "http://schemas.xmlsoap.org/soap/envelope/",name="Envelope")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
class SOAPEnvelope {
    @XmlElement(name = "Header", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private SOAPHeader header;

    @XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private SOAPBody body;

    // Standard getters and setters
}

@ToString
@XmlType(namespace="http://www.learninjava.com/common/1_0")
class SOAPHeader {
    @XmlElement(namespace = "http://www.learninjava.com/common/1_0",name = "LIJHeader")
    private LIJHeader lijHeader;

    // Standard getters and setters
}

@ToString
class SOAPBody {
    @XmlElement(name = "Response", namespace = "http://www.learninjava.com/common/1_0")
    private Response response;

    // Standard getters and setters
}

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
class LIJHeader {
    private String MsgID;
    private String Timestamp;
    private String Version;

    // Standard getters and setters
}

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
class Response {
    @XmlElement(name = "Country", namespace = "http://www.learninjava.com/common/1_0")
    private List<Country> countries;

    @XmlElement(name = "Demographics", namespace = "http://www.learninjava.com/common/1_0")
    private Demographics demographics;

    // Standard getters and setters
}

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
class Country {
    private String Code;
    private String Continent;
    private String Name;

    @XmlElement(name = "State")
    private List<State> states;

    // Standard getters and setters
}

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
class State {
    private String Code;
    private String Name;
    private String StateCode;

    // Standard getters and setters
}

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
class Demographics {
    private String Capital;
    private String Currency;
    private String Language;

    // Standard getters and setters
}
