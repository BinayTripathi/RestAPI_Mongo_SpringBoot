package com.binay.api.service.impl;



import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.binay.api.service.DataManupulationService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
public class DataManupulationServiceImplTest {

	DataManupulationService dms = null; 
	@Before
    public void setup( )  {
		dms = new DataManupulationServiceImpl();
    }
	
	
	@Test
	public void stripWhiteSpaces_should_remove_all_white_spaces_in_string() {
		
		String src = "abcd efgh";
		String tgt = "abcdefgh";
		
		String ret = dms.stripWhiteSpaces(src);
		
		Assert.assertEquals(tgt, ret);
	}
	
	@Test
	public void findHighest_should_return_highest_number() {
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		Integer highest = dms.findHighest(nums);
		Assert.assertTrue((4 == highest));
	}
	
	@Test(expected = NoSuchElementException.class)
	public void findHighest_should_through_exception_if_no_number_given() {
		
		List<Integer> nums = new ArrayList<Integer>();
		
		Integer highest = dms.findHighest(nums);
	}

}
