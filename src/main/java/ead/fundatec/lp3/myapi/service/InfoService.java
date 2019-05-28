package ead.fundatec.lp3.myapi.service;

import ead.fundatec.lp3.myapi.dto.InfoDto;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private WeatherService weatherService;
    private ZenService zenService;
    private SecretService secretService;

    public InfoService() {
        this.weatherService = new WeatherService();
        this.zenService = new ZenService();
        this.secretService = new SecretService();
    }

    public InfoDto getInfo() {
        InfoDto infoDto = new InfoDto();
        infoDto.setWeather(weatherService.getWeather());
        infoDto.setZen(zenService.getZen());
        infoDto.setSecret(secretService.getSecret());

        return infoDto;
    }
}
