package com.lt_soft.sifen.controllers;

import com.lt_soft.sifen.dtos.emisor.EmisorDto;
import com.lt_soft.sifen.models.Emisor;
import com.lt_soft.sifen.services.EmisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/emisores")
public class EmisorController {
    private final EmisorService emisorService;

    @Autowired
    public EmisorController(EmisorService emisorService) {
        this.emisorService = emisorService;
    }

    @PostMapping
    public ResponseEntity<Emisor> createEmisor(@Valid @RequestBody EmisorDto emisorDto) {
        Emisor e = emisorService.create(emisorDto);
        return ResponseEntity.status(201).body(e);
    }

    @GetMapping("/{ruc}")
    public ResponseEntity<Emisor> findByRuc(@PathVariable String ruc) {
        return ResponseEntity.ok(emisorService.findByRuc(ruc));
    }

}
