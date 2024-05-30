package org.example.demo.SoapXStream;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Demographics {
    @XStreamAsAttribute
    private String Capital;

    @XStreamAsAttribute
    private String Currency;

    @XStreamAsAttribute
    private String Language;

    // Getters and setters
}