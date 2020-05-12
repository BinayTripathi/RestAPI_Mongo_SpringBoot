package com.binay.api.persistence.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Document(collection= "outgoing")
public class OutgoingEntity {

	@Id
	private String id;
	
	private List<Character> duplicateChar;
	
	private String whiteSpacesGaloreUpdated;
	
	private Integer highestNumbersMeetNumbers;
}
