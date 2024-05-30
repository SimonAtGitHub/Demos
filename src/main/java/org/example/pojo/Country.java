package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class Country {
    @XStreamAsAttribute
    private String Code;

    @XStreamAsAttribute
    private String Continent;

    @XStreamAsAttribute
    private String Name;

    @XStreamImplicit(itemFieldName = "State")
    private List<State> states;

    // Getters and setters
}