package ead.fundatec.lp3.myapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Secret {

    private String usuario;
    private String dado_secreto;

    public String getUsuario() {
        return usuario;
    }

    public String getDado_secreto() {
        return dado_secreto;
    }
}
