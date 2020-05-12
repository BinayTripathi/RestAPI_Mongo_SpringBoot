package com.binay.api.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.binay.api.persistence.entity.OutgoingEntity;
import com.binay.api.persistence.entity.RandomPayload;


@Repository
public interface OutgoingEntityRepository extends MongoRepository<OutgoingEntity, String> {

}

