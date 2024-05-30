package org.example.pojo.soapObject;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.ToString;

@XStreamAlias("Body")
@Data
@ToString
public class SoapBody {
    @XStreamAlias("Response")
    private Response response;

    // Getters and setters
}