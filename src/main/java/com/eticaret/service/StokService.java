package com.eticaret.service;

import com.eticaret.repository.StokRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class StokService {

    private final StokRepository stokRepository;
    private final ModelMapper modelMapper;

    public StokService(StokRepository stokRepository, ModelMapper modelMapper) {
        this.stokRepository = stokRepository;
        this.modelMapper = modelMapper;
    }
}
