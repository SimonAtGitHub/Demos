package org.example.demo.soapJavaxToObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Demographics {
    @XmlAttribute(name = "Capital")
    private String capital;

    @XmlAttribute(name = "Currency")
    private String currency;

    @XmlAttribute(name = "Language")
    private String language;

    // Getters and setters
}