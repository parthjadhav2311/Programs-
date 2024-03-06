package com.parth.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {
	
	public static void main(String[] args) {
		
		Integer [] nums = {10,20,40,50,60};
		
		List a1 = Arrays.asList(nums);
		
		System.out.println(a1);
		
		Object[] numsConverted = a1.toArray(new Integer [0]);
		
		System.out.println(Arrays.toString(numsConverted));
		
		for(Object o : numsConverted)
		{
			System.out.println((Integer)0+10);
		}
	}

}
