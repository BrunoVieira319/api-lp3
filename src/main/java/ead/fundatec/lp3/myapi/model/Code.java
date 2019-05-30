package ead.fundatec.lp3.myapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Code {

    private List<Integer> rgba;
    private String hex;

    public Code() {
        rgba = new ArrayList<>();
    }

    public List<Integer> getRgba() {
        return rgba;
    }

    public String getHex() {
        return hex;
    }
}
