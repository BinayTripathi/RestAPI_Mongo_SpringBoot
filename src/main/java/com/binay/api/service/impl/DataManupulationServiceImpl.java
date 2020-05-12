package com.binay.api.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.binay.api.service.DataManupulationService;

@Service
public class DataManupulationServiceImpl implements DataManupulationService {
	
	public Integer findHighest(List<Integer> numbersMeetNumbers) {
		
		return numbersMeetNumbers.stream().mapToInt(no -> no).max().orElseThrow(NoSuchElementException::new);
	}
	
	public List<Character> findDuplicatesInString(String dupString) {
		
		List<Character> duplicateCharacters = new ArrayList<Character>();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
	    char[] charsInDupString = dupString.toCharArray();
	 
	    for(Character ch : charsInDupString){
	    	
	    	if ( charMap.containsKey(ch) ) 
	    	{
	    		Integer count = charMap.get(ch);
	    		if (count == 1)
	    			duplicateCharacters.add(ch);
	    		charMap.put(ch, ++count);	    		
	    	}else
	    		charMap.put(ch, 1);
	    		
	    	
	    }
	    
	    return duplicateCharacters;
	}
	
	public String stripWhiteSpaces(String whiteSpacesGalore) {
		
		String[] tokens = whiteSpacesGalore.split("\\s");
		String joinedString = String.join("", tokens);
		return joinedString;
	}

}
