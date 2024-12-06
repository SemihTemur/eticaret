package com.eticaret.controller;

import com.eticaret.service.KuponService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rest/api")
public class KuponController {

    private final KuponService kuponService;

    public KuponController(KuponService kuponService) {
        this.kuponService = kuponService;
    }
}
