package org.example.pojo.soapObject;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LIJHeader {
    @XStreamAsAttribute
    private String MsgID;

    @XStreamAsAttribute
    private String Timestamp;

    @XStreamAsAttribute
    private String Version;

    // Getters and setters
}
