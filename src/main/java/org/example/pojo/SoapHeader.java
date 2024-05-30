package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@XStreamAlias("Header")
public class SoapHeader {

    @XStreamAlias("LIJHeader")
    private LIJHeader lijHeader;

    // Getters and setters
}