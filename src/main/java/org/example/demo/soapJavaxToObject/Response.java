package org.example.demo.soapJavaxToObject;

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
public class Response {
    @XmlElement(namespace = Constants.lij,name="Country")
    private Country country;

    @XmlElement(namespace = Constants.lij,name="Demographics")
    private Demographics demographics;

    // Getters and setters
}