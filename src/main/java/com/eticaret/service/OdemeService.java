package com.eticaret.service;

import com.eticaret.repository.OdemeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OdemeService {

    private final OdemeRepository odemeRepository;
    private final ModelMapper modelMapper;

    public OdemeService(OdemeRepository odemeRepository, ModelMapper modelMapper) {
        this.odemeRepository = odemeRepository;
        this.modelMapper = modelMapper;
    }
}
