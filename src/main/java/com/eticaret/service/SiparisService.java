package com.eticaret.service;

import com.eticaret.repository.SiparisRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SiparisService {

    private final SiparisRepository siparisRepository;
    private final ModelMapper modelMapper;

    public SiparisService(SiparisRepository siparisRepository, ModelMapper modelMapper) {
        this.siparisRepository = siparisRepository;
        this.modelMapper = modelMapper;
    }
}
