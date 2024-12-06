package com.eticaret.controller;

import com.eticaret.service.KargoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class KargoController {

    private final KargoService kargoService;

    public KargoController(KargoService kargoService) {
        this.kargoService = kargoService;
    }
}
