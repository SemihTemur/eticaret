package com.eticaret.controller;

import com.eticaret.service.AbonelikService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class AbonelikController {

    private final AbonelikService abonelikService;

    public AbonelikController(AbonelikService abonelikService) {
        this.abonelikService = abonelikService;
    }



}
