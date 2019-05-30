package ead.fundatec.lp3.myapi.service;

import ead.fundatec.lp3.myapi.dto.InfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private WeatherService weatherService;
    private ZenService zenService;
    private SecretService secretService;

    @Autowired
    public InfoService(WeatherService weatherService, ZenService zenService, SecretService secretService) {
        this.weatherService = weatherService;
        this.zenService = zenService;
        this.secretService = secretService;
    }

    public InfoDto getInfo() {
        InfoDto infoDto = new InfoDto();
        infoDto.setWeather(weatherService.getWeather());
        infoDto.setZen(zenService.getZen());
        infoDto.setSecret(secretService.getSecret());

        return infoDto;
    }
}
