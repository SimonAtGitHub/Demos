package org.example.pojo.soapObject1;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
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
    @XmlAttribute()
    private String Code;

    @XmlAttribute()
    private String Name;

    @XmlAttribute()
    private String StateCode;

    // Getters and setters
}