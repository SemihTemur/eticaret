package com.eticaret.service;

import com.eticaret.repository.OneriRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OneriService {

    private final OneriRepository oneriRepository;
    private final ModelMapper modelMapper;

    public OneriService(OneriRepository oneriRepository, ModelMapper modelMapper) {
        this.oneriRepository = oneriRepository;
        this.modelMapper = modelMapper;
    }
}
