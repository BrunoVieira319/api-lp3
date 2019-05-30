package ead.fundatec.lp3.myapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Color {

    private String color;
    private String category;
    private String type;
    private Code code;

    public Color() {}

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public Code getCode() {
        return code;
    }
}
