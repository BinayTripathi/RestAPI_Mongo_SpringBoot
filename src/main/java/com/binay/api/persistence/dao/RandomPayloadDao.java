package com.binay.api.persistence.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.binay.api.persistence.entity.RandomPayload;
import com.binay.api.persistence.repository.RandomPayloadRepository;

@Transactional
@Service
public class RandomPayloadDao {
	
	@Autowired
	RandomPayloadRepository randomPayloadRepository;
	
	public RandomPayload savePayload(RandomPayload randomPayload) {
		
		RandomPayload response = randomPayloadRepository.save(randomPayload);
		return response;
		
	}
	
	

}
