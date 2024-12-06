package com.eticaret.controller;

import com.eticaret.service.AdresService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class AdresController {

    private final AdresService adresService;

    public AdresController(AdresService adresService) {
        this.adresService = adresService;
    }
}
