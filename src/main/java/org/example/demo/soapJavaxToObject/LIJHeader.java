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
public class LIJHeader {
    @XmlAttribute(name="MsgID")
    private String MsgID;

    @XmlAttribute(name="Timestamp")
    private String Timestamp;

    @XmlAttribute(name="Version")
    private String Version;

    // Getters and setters
}
