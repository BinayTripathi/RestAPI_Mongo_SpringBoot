package com.binay.api.service;

import java.util.List;

public interface DataManupulationService {
	
	public Integer findHighest(List<Integer> numbersMeetNumbers);
	
	public List<Character> findDuplicatesInString(String dupString);
	
	public String stripWhiteSpaces(String whiteSpacesGalore);

}
