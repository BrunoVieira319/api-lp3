package ead.fundatec.lp3.myapi.dto;

import ead.fundatec.lp3.myapi.model.Secret;
import ead.fundatec.lp3.myapi.model.Weather;
import ead.fundatec.lp3.myapi.model.Zen;

public class InfoDto {

    private Weather weather;
    private Zen zen;
    private Secret secret;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Zen getZen() {
        return zen;
    }

    public void setZen(Zen zen) {
        this.zen = zen;
    }

    public Secret getSecret() {
        return secret;
    }

    public void setSecret(Secret secret) {
        this.secret = secret;
    }
}
