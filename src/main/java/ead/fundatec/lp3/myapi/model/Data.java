package ead.fundatec.lp3.myapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    private String date;

    public Data() {
    }

    public Integer getTemperature() {
        return temperature;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public Double getWind_velocity() {
        return wind_velocity;
    }

    public Double getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }

    public Double getPressure() {
        return pressure;
    }

    public String getIcon() {
        return icon;
    }

    public Integer getSensation() {
        return sensation;
    }

    public String getDate() {
        return date;
    }
}
