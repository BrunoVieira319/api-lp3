package ead.fundatec.lp3.myapi.service;

import ead.fundatec.lp3.myapi.model.Weather;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class WeatherService {

    private RestTemplate restTemplate;

    public WeatherService() {
        restTemplate = new RestTemplate();
    }

    public Weather getWeather() {
        String token = "ab6ffbea2564906b03695ea07fbbf05b";
        String url = "http://apiadvisor.climatempo.com.br/api/v1/weather/locale/5346/current?token=";

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Weather> weather = restTemplate.exchange(url + token, HttpMethod.GET, entity, Weather.class );

        return weather.getBody();
    }
}
