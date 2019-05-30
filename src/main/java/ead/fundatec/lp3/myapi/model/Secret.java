package ead.fundatec.lp3.myapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Secret {

    private List<Color> colors;

    public Secret() {
        colors = new ArrayList<>();
    }

    public List<Color> getColors() {
        return Collections.unmodifiableList(colors);
    }
}
