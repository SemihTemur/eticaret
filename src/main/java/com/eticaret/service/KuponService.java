package com.eticaret.service;

import com.eticaret.repository.KuponRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class KuponService {

    private final KuponRepository kuponRepository;
    private final ModelMapper modelMapper;

    public KuponService(KuponRepository kuponRepository, ModelMapper modelMapper) {
        this.kuponRepository = kuponRepository;
        this.modelMapper = modelMapper;
    }

}
