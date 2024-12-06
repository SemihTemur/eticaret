package com.eticaret.service;

import com.eticaret.repository.UrunRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UrunService {

    private final UrunRepository urunRepository;
    private final ModelMapper modelMapper;

    public UrunService(UrunRepository urunRepository, ModelMapper modelMapper) {
        this.urunRepository = urunRepository;
        this.modelMapper = modelMapper;
    }
}
