package com.eticaret.service;

import com.eticaret.repository.KargoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class KargoService {

    private final KargoRepository kargoRepository;
    private final ModelMapper modelMapper;

    public KargoService(KargoRepository kargoRepository, ModelMapper modelMapper) {
        this.kargoRepository = kargoRepository;
        this.modelMapper = modelMapper;
    }
}
