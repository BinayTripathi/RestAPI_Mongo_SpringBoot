package com.binay.api.controller;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.binay.api.controller.dto.RandomPayloadDto;
import com.binay.api.persistence.dao.OutgoingEntityDao;
import com.binay.api.persistence.dao.RandomPayloadDao;
import com.binay.api.persistence.entity.OutgoingEntity;
import com.binay.api.persistence.entity.RandomPayload;
import com.binay.api.service.DataManupulationService;

@RestController
public class RandomPayloadRestController {

	@Autowired
	RandomPayloadDao randomPayloaodDao;

	@Autowired
	OutgoingEntityDao outgoingEntityDao;

	@Autowired
	DataManupulationService dms;

	@PostMapping(path = "/incoming")
	public ResponseEntity<Object> createUser(@RequestBody RandomPayloadDto randomPayloadDto)
	{
		
		try {
			RandomPayload payload = new RandomPayload();
			BeanUtils.copyProperties(payload, randomPayloadDto);
			randomPayloaodDao.savePayload(payload);
			
			List<Character> duplicatesInString = dms.findDuplicatesInString(payload.getFindDuplicates());
			Integer highestNo = dms.findHighest(payload.getNumbersMeetNumbers());
			String stripWhiteSpaces = dms.stripWhiteSpaces(payload.getWhiteSpacesGalore());
			
			OutgoingEntity outgoingEntity = new OutgoingEntity();
			outgoingEntity.setId(payload.getId());
			outgoingEntity.setDuplicateChar(duplicatesInString);
			outgoingEntity.setHighestNumbersMeetNumbers(highestNo);
			outgoingEntity.setWhiteSpacesGaloreUpdated(stripWhiteSpaces);
			
			outgoingEntityDao.savePayload(outgoingEntity);              
		    
			
			
		} catch (IllegalAccessException | InvocationTargetException e) {

		}
		URI location = ServletUriComponentsBuilder
	              .fromCurrentRequest()
	              .path("/{id}")      
	              .buildAndExpand(randomPayloadDto.getId()) 
	              .toUri();
		return  ResponseEntity.created(location).build();

	}

}
