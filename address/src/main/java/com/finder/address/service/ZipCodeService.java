package com.finder.address.service;

import com.finder.address.client.ZipCodeClient;
import com.finder.address.model.AddressLog;
import com.finder.address.model.dto.AddressDTO;
import com.finder.address.repository.AddressLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ZipCodeService {
    @Autowired
    private ZipCodeClient zipcodeClient;

    @Autowired
    private AddressLogRepository addressLogRepository;

    public AddressDTO findAddressByZipCode(String zipcode) {
        AddressDTO addressLog = zipcodeClient.findAddressByZipCode(zipcode);

        createSearchLog(addressLog);

        return addressLog;
    }

    private void createSearchLog(AddressDTO addressDTO){
        AddressLog addressLog = new AddressLog();
        addressLog.setConsultedAt(LocalDateTime.now());
        addressLog.setStreet(addressDTO.getStreet());
        addressLog.setCity(addressDTO.getCity());
        addressLog.setState(addressDTO.getState());
        addressLog.setNeighborhood(addressDTO.getNeighborhood());
        addressLog.setZipCode(addressDTO.getZipCode());

        addressLogRepository.save(addressLog);
    }
}