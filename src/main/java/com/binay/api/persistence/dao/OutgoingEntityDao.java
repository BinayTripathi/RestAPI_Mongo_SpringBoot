package com.binay.api.persistence.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.binay.api.persistence.entity.OutgoingEntity;
import com.binay.api.persistence.entity.RandomPayload;
import com.binay.api.persistence.repository.OutgoingEntityRepository;
import com.binay.api.persistence.repository.RandomPayloadRepository;

@Transactional
@Service
public class OutgoingEntityDao {
	
	@Autowired
	OutgoingEntityRepository outgoingEntityRepository;
	
	public OutgoingEntity savePayload(OutgoingEntity outgoingEntity) {
		
		OutgoingEntity response = outgoingEntityRepository.save(outgoingEntity);
		return response;
		
	}
	
	

}
