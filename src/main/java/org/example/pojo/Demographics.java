package org.example.pojo;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Demographics {
    @XStreamAsAttribute
    private String Capital;

    @XStreamAsAttribute
    private String Currency;

    @XStreamAsAttribute
    private String Language;

    // Getters and setters
}