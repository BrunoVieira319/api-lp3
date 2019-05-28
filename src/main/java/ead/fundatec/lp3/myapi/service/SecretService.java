package ead.fundatec.lp3.myapi.service;

import ead.fundatec.lp3.myapi.model.Secret;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

public class SecretService {

    private RestTemplate restTemplate;
    private String username;
    private String password;

    public SecretService() {
        this.restTemplate = new RestTemplate();
        this.username = "";
        this.password = "";
    }

    public Secret getSecret() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(username, password, StandardCharsets.UTF_8);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Secret> secret = restTemplate.exchange("https://lp3-secret.herokuapp.com/", HttpMethod.POST, entity, Secret.class);

        return secret.getBody();
    }
}
