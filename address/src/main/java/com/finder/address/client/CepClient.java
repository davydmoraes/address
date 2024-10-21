package com.finder.address.client;

import com.finder.address.model.AddressLog;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CepClient {

    private final String API_URL = "http://localhost:8081/api/mock/cep/";

    public AddressLog findAddressByCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        AddressLog addressLog = restTemplate.getForObject(API_URL + cep, AddressLog.class);
        return addressLog;
    }
}