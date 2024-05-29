package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;
import org.example.pojo.*;

@Data
@XStreamAlias("Header")
public class SoapHeader {

    @XStreamAlias("lijcommon")
    private LIJCommon lijHeader;

    // Getters and setters
}