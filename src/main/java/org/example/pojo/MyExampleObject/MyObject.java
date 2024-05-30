package org.example.pojo.MyExampleObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlRootElement(namespace = "http://www.registar.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyObject {

    @XmlElement(name="Name")
    private String name;

    @XmlElement(namespace = "http://www.registar.com/ScoreVariant",name = "ScoreVariant")
    private String scoreVariant;

}