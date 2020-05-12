package com.binay.api.controller.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RandomPayloadDto {

    private String id;
	
	private String findDuplicates;
	
	private String whiteSpacesGalore;
	
	private boolean validateMeOnlyIActuallyShouldBeABoolean;
	
	private List<Integer> numbersMeetNumbers;
}
