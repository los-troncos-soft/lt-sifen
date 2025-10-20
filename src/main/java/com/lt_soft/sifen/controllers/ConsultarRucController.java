package com.lt_soft.sifen.controllers;

import com.lt_soft.sifen.services.ConsultarRucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consultar-ruc/{idEmisor}/{ruc}")
public class ConsultarRucController {
    @Autowired
    private ConsultarRucService rucService;

    @GetMapping
    public ResponseEntity<String> consultarRuc(@PathVariable Long idEmisor, @PathVariable String ruc) {
        return ResponseEntity.ok(rucService.consultarRucSifen(idEmisor, ruc));
    }
}
