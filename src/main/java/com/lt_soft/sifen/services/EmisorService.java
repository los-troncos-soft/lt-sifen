package com.lt_soft.sifen.services;

import com.lt_soft.sifen.models.Emisor;
import com.lt_soft.sifen.repositories.EmisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmisorService {
    private final EmisorRepository emisorRepository;

    @Autowired
    public EmisorService(EmisorRepository emisorRepository) {
        this.emisorRepository = emisorRepository;
    }

    public Emisor create(Emisor emisor) {
        return emisorRepository.save(emisor);
    }
}
