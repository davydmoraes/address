package com.finder.address.controller;

import com.finder.address.model.dto.AddressDTO;
import com.finder.address.service.ZipCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/zipcode")
public class ZipCodeController {

    @Autowired
    private ZipCodeService zipcodeService;

    @GetMapping("/{zipcode}")
    public ResponseEntity<AddressDTO> buscarZipCode(@PathVariable String zipcode) {
        try {
            AddressDTO addressLog = zipcodeService.findAddressByZipCode(zipcode);

            return ResponseEntity.ok(addressLog);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}