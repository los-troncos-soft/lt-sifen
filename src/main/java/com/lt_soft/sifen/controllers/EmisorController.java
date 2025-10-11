package com.lt_soft.sifen.controllers;

import com.lt_soft.sifen.models.Emisor;
import com.lt_soft.sifen.services.EmisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emisores")
public class EmisorController {
    private final EmisorService emisorService;

    @Autowired
    public EmisorController(EmisorService emisorService) {
        this.emisorService = emisorService;
    }

    @PostMapping
    public ResponseEntity<Emisor> createEmisor(@RequestBody Emisor emisor) {
        Emisor e = emisorService.create(emisor);
        return ResponseEntity.status(201).body(e);
    }
}
