package com.eticaret.service;

import com.eticaret.repository.SepetRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SepetService {

    private final SepetRepository sepetRepository;
    private final ModelMapper modelMapper;

    public SepetService(SepetRepository sepetRepository, ModelMapper modelMapper) {
        this.sepetRepository = sepetRepository;
        this.modelMapper = modelMapper;
    }
}
