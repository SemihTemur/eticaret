package com.eticaret.controller;

import com.eticaret.service.SepetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class SepetController {

    private final SepetService sepetService;

    public SepetController(SepetService sepetService) {
        this.sepetService = sepetService;
    }
}
