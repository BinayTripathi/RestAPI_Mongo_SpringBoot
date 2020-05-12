package com.binay.api.persistence.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Document(collection= "incoming")
public class RandomPayload {

	@Id
	private String id;
	
	private String findDuplicates;
	
	private String whiteSpacesGalore;
	
	private boolean validateMeOnlyIActuallyShouldBeABoolean;
	
	private List<Integer> numbersMeetNumbers;
}
