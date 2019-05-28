package ead.fundatec.lp3.myapi.controller;

import ead.fundatec.lp3.myapi.dto.InfoDto;
import ead.fundatec.lp3.myapi.service.InfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin
public class MyApiController {

    private InfoService infoService;

    public MyApiController() {
        this.infoService = new InfoService();
    }

    @PostMapping(value = "/info")
    public ResponseEntity<InfoDto> getInfo() {
        InfoDto infoDto = infoService.getInfo();
        return new ResponseEntity<>(infoDto, HttpStatus.OK);
    }
}
