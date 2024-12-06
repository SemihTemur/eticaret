package com.eticaret.service;

import com.eticaret.repository.FavorilerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class FavorilerService {

    private final FavorilerRepository favorilerRepository;
    private final ModelMapper modelMapper;

    public FavorilerService(FavorilerRepository favorilerRepository, ModelMapper modelMapper) {
        this.favorilerRepository = favorilerRepository;
        this.modelMapper = modelMapper;
    }
}
