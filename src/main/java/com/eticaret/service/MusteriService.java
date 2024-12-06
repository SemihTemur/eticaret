package com.eticaret.service;

import com.eticaret.dto.request.MusteriRequest;
import com.eticaret.entity.Musteri;
import com.eticaret.repository.MusteriRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MusteriService {

    private final MusteriRepository musteriRepository;
    private final ModelMapper modelMapper;

    public MusteriService(MusteriRepository musteriRepository, ModelMapper modelMapper) {
        this.musteriRepository = musteriRepository;
        this.modelMapper = modelMapper;
    }

    public void saveMusteri(MusteriRequest musteriRequest) {
        musteriRepository.save(modelMapper.map(musteriRequest, Musteri.class));
    }

}
