package org.example.demo.soapJavaxToXml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Country {
    @XmlAttribute(namespace = "http://www.learninjava.com/soaptoobject/1_0/")
    private String Code;

    @XmlAttribute()
    private String Continent;

    @XmlAttribute()
    private String Name;

    @XmlElement(name = "State")
    private List<State> states;

    // Getters and setters
}