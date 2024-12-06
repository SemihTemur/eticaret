package com.eticaret.service;

import com.eticaret.repository.SaticiRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SaticiService {

    private final SaticiRepository saticiRepository;
    private final ModelMapper modelMapper;

    public SaticiService(SaticiRepository saticiRepository, ModelMapper modelMapper) {
        this.saticiRepository = saticiRepository;
        this.modelMapper = modelMapper;
    }
}
