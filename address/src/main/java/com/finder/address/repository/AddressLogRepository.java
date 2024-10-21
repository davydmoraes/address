package com.finder.address.repository;

import com.finder.address.model.AddressLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressLogRepository extends MongoRepository<AddressLog, Long> {
}