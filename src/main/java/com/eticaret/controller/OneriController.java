package com.eticaret.controller;

import com.eticaret.service.OneriService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class OneriController {

    private final OneriService oneriService;

    public OneriController(OneriService oneriService) {
        this.oneriService = oneriService;
    }
}
