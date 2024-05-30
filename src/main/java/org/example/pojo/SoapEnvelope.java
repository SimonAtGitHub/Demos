package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@XStreamAlias("Envelope")
public class SoapEnvelope {

    @XStreamAlias("Header")
    private SoapHeader header;

    @XStreamAlias("Body")
    private SoapBody body;

    // Getters and setters
}
