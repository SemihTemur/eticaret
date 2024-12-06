package com.eticaret.service;

import com.eticaret.repository.YorumRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class YorumService {

    private final YorumRepository yorumRepository;
    private final ModelMapper modelMapper;

    public YorumService(YorumRepository yorumRepository, ModelMapper modelMapper) {
        this.yorumRepository = yorumRepository;
        this.modelMapper = modelMapper;
    }

}
