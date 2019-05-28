package ead.fundatec.lp3.myapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private String id;
    private String name;
    private String state;
    private String country;
    private Data data;

    public Weather() {
    }

    public String getName() {
        return name;
    }
}
