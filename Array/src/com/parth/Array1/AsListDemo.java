package com.parth.Array1;

import java.util.Arrays;
import java.util.List;

public class AsListDemo {
	
	public static void main(String[] args) {
		
		Integer[] nums = {10,30,20,50,10,20,50};
		
		List numsList = Arrays.asList(nums);
		
		System.out.println(numsList);
	}

}
