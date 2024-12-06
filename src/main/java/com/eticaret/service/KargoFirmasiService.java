package com.eticaret.service;

import com.eticaret.repository.KargoFirmasiRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class KargoFirmasiService {

    private final KargoFirmasiRepository kargoFirmasiRepository;
    private final ModelMapper modelMapper;

    public KargoFirmasiService(KargoFirmasiRepository kargoFirmasiRepository, ModelMapper modelMapper) {
        this.kargoFirmasiRepository = kargoFirmasiRepository;
        this.modelMapper = modelMapper;
    }
}
