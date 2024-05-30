package org.example.demo.soapJavaxToObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@XmlRootElement(namespace = "http://schemas.xmlsoap.org/soap/envelope/",name="Envelope")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapEnvelope {

    @XmlElement(namespace = Constants.soapEnv,name="Header")
    private SoapHeader header;

    @XmlElement(namespace = Constants.soapEnv,name="Body")
    private SoapBody body;

}
