package com.eticaret.controller;

import com.eticaret.service.FavorilerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class FavorilerController {

    private final FavorilerService favorilerService;

    public FavorilerController(FavorilerService favorilerService) {
        this.favorilerService = favorilerService;
    }
}
