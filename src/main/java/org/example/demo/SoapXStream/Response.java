package org.example.demo.SoapXStream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Response {
    @XStreamAlias("Country")
    private Country country;

    @XStreamAlias("Demographics")
    private Demographics demographics;

    // Getters and setters
}