package com.eticaret.service;

import com.eticaret.repository.AbonelikRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AbonelikService {

    private final AbonelikRepository abonelikRepository;
    private final ModelMapper modelMapper;

    public AbonelikService(AbonelikRepository abonelikRepository, ModelMapper modelMapper) {
        this.abonelikRepository = abonelikRepository;
        this.modelMapper = modelMapper;
    }


}
