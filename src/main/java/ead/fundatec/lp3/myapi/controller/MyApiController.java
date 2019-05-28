package ead.fundatec.lp3.myapi.controller;

import ead.fundatec.lp3.myapi.dto.InfoDto;
import ead.fundatec.lp3.myapi.service.InfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin
public class MyApiController {

    private InfoService infoService;

    public MyApiController() {
        this.infoService = new InfoService();
    }

    @GetMapping(value = "/info")
    public ResponseEntity<InfoDto> getInfo() {
        InfoDto infoDto = infoService.getInfo();
        return new ResponseEntity<>(infoDto, HttpStatus.OK);
    }
}
