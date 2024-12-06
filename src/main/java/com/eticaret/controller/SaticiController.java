package com.eticaret.controller;

import com.eticaret.service.SaticiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class SaticiController {

    private final SaticiService saticiService;

    public SaticiController(SaticiService saticiService) {
        this.saticiService = saticiService;
    }
}
