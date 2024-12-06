package com.eticaret.controller;

import com.eticaret.service.StokService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class StokController {

    private final StokService stokService;

    public StokController(StokService stokService) {
        this.stokService = stokService;
    }

}
