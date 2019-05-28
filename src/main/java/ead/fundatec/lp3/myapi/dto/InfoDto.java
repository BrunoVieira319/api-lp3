package ead.fundatec.lp3.myapi.dto;

import ead.fundatec.lp3.myapi.model.Weather;

public class InfoDto {

    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
