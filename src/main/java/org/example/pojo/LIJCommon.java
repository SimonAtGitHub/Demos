package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class LIJCommon {
    @XStreamAsAttribute
    private String MsgID;

    @XStreamAsAttribute
    private String Timestamp;

    @XStreamAsAttribute
    private String Version;

    // Getters and setters
}
