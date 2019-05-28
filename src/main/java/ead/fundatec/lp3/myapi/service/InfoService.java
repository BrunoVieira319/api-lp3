package ead.fundatec.lp3.myapi.service;

import ead.fundatec.lp3.myapi.dto.InfoDto;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    public InfoDto getInfo() {

        InfoDto infoDto = new InfoDto();
        infoDto.setWeather(new WeatherService().getWeather());

        return infoDto;
    }
}
