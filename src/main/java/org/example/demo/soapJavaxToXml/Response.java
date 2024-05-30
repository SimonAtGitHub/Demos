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
public class Response {
    @XmlElement(namespace = "http://www.learninjava.com/soaptoobject/1_0/",name="Country")
    private Country country;

    @XmlElement(namespace = "http://www.learninjava.com/soaptoobject/1_0/",name="Demographics")
    private Demographics demographics;

    // Getters and setters
}