package com.finder.address.service;

import com.finder.address.client.CepClient;
import com.finder.address.model.AddressLog;
import com.finder.address.repository.AddressLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CepService {
    @Autowired
    private CepClient cepClient;

    @Autowired
    private AddressLogRepository addressLogRepository;

    public AddressLog findAddressByCep(String cep) {
        AddressLog addressLog = cepClient.findAddressByCep(cep);
        addressLog.setConsultaEm(LocalDateTime.now());
        addressLogRepository.save(addressLog);
        return addressLog;
    }
}