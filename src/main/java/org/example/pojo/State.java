package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class State {
    @XStreamAsAttribute
    private String Code;

    @XStreamAsAttribute
    private String Name;

    @XStreamAsAttribute
    private String StateCode;

    // Getters and setters
}