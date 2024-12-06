package com.eticaret.controller;

import com.eticaret.service.İadeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class İadeController {

    private final İadeService service;

    public İadeController(İadeService service) {
        this.service = service;
    }


}
