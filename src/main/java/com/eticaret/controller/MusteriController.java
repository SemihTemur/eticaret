package com.eticaret.controller;

import com.eticaret.dto.request.MusteriRequest;
import com.eticaret.service.MusteriService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class MusteriController {

    private final MusteriService musteriService;

    public MusteriController(MusteriService musteriService) {
        this.musteriService = musteriService;
    }

    @PostMapping(path="/saveMusteri")
    public void saveMusteri(@RequestBody MusteriRequest musteriRequest) {
        musteriService.saveMusteri(musteriRequest);
    }

}
