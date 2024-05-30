package org.example.demo.soapJavaxXml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class LIJHeader {
    @XmlAttribute()
    private String MsgID;

    @XmlAttribute()
    private String Timestamp;

    @XmlAttribute()
    private String Version;

    // Getters and setters
}
