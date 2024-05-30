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
public class Demographics {
    @XmlAttribute()
    private String Capital;

    @XmlAttribute()
    private String Currency;

    @XmlAttribute()
    private String Language;

    // Getters and setters
}