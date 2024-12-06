package com.eticaret.service;

import com.eticaret.repository.AdresRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AdresService {

    private final AdresRepository adresRepository;
    private final ModelMapper modelMapper;

    public AdresService(AdresRepository adresRepository, ModelMapper modelMapper) {
        this.adresRepository = adresRepository;
        this.modelMapper = modelMapper;
    }
}
