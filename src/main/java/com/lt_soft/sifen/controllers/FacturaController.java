package com.lt_soft.sifen.controllers;

import com.lt_soft.sifen.dtos.factura.FacturaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {
    @PostMapping
    public ResponseEntity<FacturaDto> createFactura(@Valid @RequestBody FacturaDto request){
        return ResponseEntity.ok(request);
    }
}
