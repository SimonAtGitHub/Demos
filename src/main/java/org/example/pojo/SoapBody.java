package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@XStreamAlias("Body")
@Data
public class SoapBody {
    @XStreamAlias("Response")
    private Response response;

    // Getters and setters
}