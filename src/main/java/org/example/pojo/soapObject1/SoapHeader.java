package org.example.pojo.soapObject1;

import com.thoughtworks.xstream.annotations.XStreamAlias;
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
public class SoapHeader {

    @XmlElement(namespace = "http://www.learninjava.com/soaptoobject/1_1/",name="LIJHeader")
    private LIJHeader lijHeader;

    // Getters and setters
}