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
public class State {

    @XmlAttribute(namespace = Constants.lij)
    private String Code;

    @XmlAttribute(namespace = Constants.lij)
    private String Name;

    @XmlAttribute(namespace = Constants.lij)
    private String StateCode;

    // Getters and setters
}