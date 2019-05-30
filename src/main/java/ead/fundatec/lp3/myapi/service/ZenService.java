package ead.fundatec.lp3.myapi.service;

import ead.fundatec.lp3.myapi.model.Zen;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZenService {

    private RestTemplate restTemplate;

    public ZenService() {
        this.restTemplate = new RestTemplate();
    }

    public Zen getZen() {
        String phrase = restTemplate.getForObject("https://api.github.com/zen", String.class);
        return new Zen(phrase);
    }
}
