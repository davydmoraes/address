package com.finder.address.controller;

import com.finder.address.model.AddressLog;
import com.finder.address.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<AddressLog> buscarCep(@PathVariable String cep) {
        try {
            AddressLog addressLog = cepService.findAddressByCep(cep);

            return ResponseEntity.ok(addressLog);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}