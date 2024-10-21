package com.finder.address.client;

import com.finder.address.model.dto.AddressDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ZipCodeClient {

    private final String API_URL = "http://localhost:8081/api/mock/zipcode/";

    public AddressDTO findAddressByZipCode(String zipcode) {
        RestTemplate restTemplate = new RestTemplate();
        AddressDTO addressLog = restTemplate.getForObject(API_URL + zipcode, AddressDTO.class);
        return addressLog;
    }
}