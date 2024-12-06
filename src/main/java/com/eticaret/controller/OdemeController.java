package com.eticaret.controller;

import com.eticaret.service.OdemeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class OdemeController {

    private final OdemeService odeme;

    public OdemeController(OdemeService odeme) {
        this.odeme = odeme;
    }
}
