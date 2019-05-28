package ead.fundatec.lp3.myapi.service;

import ead.fundatec.lp3.myapi.dto.InfoDto;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private WeatherService weatherService;
    private ZenService zenService;

    public InfoService() {
        this.weatherService = new WeatherService();
        this.zenService = new ZenService();
    }

    public InfoDto getInfo() {

        InfoDto infoDto = new InfoDto();
        infoDto.setWeather(weatherService.getWeather());
        infoDto.setZen(zenService.getZen());

        return infoDto;
    }
}
