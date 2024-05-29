package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

@Data
public class Response {
    @XStreamAlias("Country")
    private Country country;

    @XStreamAlias("Demographics")
    private Demographics demographics;

    // Getters and setters
}