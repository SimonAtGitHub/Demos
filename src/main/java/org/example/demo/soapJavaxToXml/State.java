package org.example.demo.soapJavaxToXml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class State {
    @XmlAttribute()
    private String Code;

    @XmlAttribute()
    private String Name;

    @XmlAttribute()
    private String StateCode;

    @XmlValue
    private String Value;

    // Getters and setters
}