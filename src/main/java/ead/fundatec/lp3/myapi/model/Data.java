package ead.fundatec.lp3.myapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private Integer temperature;
    private String wind_direction;
    private Double wind_velocity;
    private Double humidity;
    private String condition;
    private Double pressure;
    private String icon;
    private Integer sensation;

    public Data() {
    }

}
