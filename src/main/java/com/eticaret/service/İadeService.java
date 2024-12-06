package com.eticaret.service;

import com.eticaret.repository.İadeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class İadeService {

    private final İadeRepository i̇adeRepository;
    private final ModelMapper modelMapper;

    public İadeService(İadeRepository i̇adeRepository, ModelMapper modelMapper) {
        this.i̇adeRepository = i̇adeRepository;
        this.modelMapper = modelMapper;
    }
}
