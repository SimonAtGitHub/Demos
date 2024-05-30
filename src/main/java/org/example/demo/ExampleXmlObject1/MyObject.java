package org.example.demo.ExampleXmlObject1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlRootElement(namespace = "http://www.example1.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyObject {

    @XmlAttribute(name="attribute1")
    private String attr1;

    @XmlElement(name = "Items")
    private List<Item> items;

    @XmlElement(namespace = "http://www.example1.com", name = "test")
    private String test;

}

@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
class Item {

    @XmlAttribute(name="id")
    private String id;

    @XmlElement(name="name",namespace = "http://www.example2.com")
    private String name;

    @XmlElement(name="Weight",namespace = "http://www.example2.com")
    private String weight;

}