package com.lt_soft.sifen.services;

import com.lt_soft.sifen.dtos.emisor.EmisorDto;
import com.lt_soft.sifen.models.Emisor;
import com.lt_soft.sifen.repositories.EmisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import javax.persistence.EntityNotFoundException;

@Service
public class EmisorService {
    private final EmisorRepository emisorRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EmisorService(EmisorRepository emisorRepository, ModelMapper modelMapper) {
        this.emisorRepository = emisorRepository;
        this.modelMapper = modelMapper;
    }

    public Emisor create(EmisorDto emisorDto) {
        Emisor emisor = modelMapper.map(emisorDto, Emisor.class);
        return emisorRepository.save(emisor);
    }

    public Emisor getById(Long idEmisor) {
        return emisorRepository.findById(idEmisor)
                .orElseThrow(() -> new EntityNotFoundException("Emisor no encontrado con id: " + idEmisor));
    }
}
