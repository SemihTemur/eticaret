package com.eticaret.service;

import com.eticaret.repository.KategoriRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class KategoriService {

    private final KategoriRepository kategoriRepository;
    private final ModelMapper modelMapper;

    public KategoriService(KategoriRepository kategoriRepository, ModelMapper modelMapper) {
        this.kategoriRepository = kategoriRepository;
        this.modelMapper = modelMapper;
    }
}
