package ead.fundatec.lp3.myapi.model;

import java.util.ArrayList;
import java.util.List;

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
