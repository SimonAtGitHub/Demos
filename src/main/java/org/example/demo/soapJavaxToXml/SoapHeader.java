package org.example.demo.soapJavaxToXml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapHeader {

    // This field will not be included in the XML if it's null
    // @XmlElement(nillable = false)

    @XmlElement(namespace = "http://www.learninjava.com/soaptoobject/1_1/",name="LIJHeader")
    private LIJHeader lijHeader;

    // Getters and setters
}