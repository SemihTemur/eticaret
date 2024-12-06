package com.eticaret.controller;

import com.eticaret.service.KargoFirmasiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class KargoFirmasiController {

    private final KargoFirmasiService kargoFirmasiService;

    public KargoFirmasiController(KargoFirmasiService kargoFirmasiService) {
        this.kargoFirmasiService = kargoFirmasiService;
    }
}
