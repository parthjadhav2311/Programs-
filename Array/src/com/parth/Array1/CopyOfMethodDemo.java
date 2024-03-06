package com.parth.Array1;

import java.util.Arrays;

public class CopyOfMethodDemo {
	
	public static void main(String[] args) {
		
		int[] nums = {10,30,20,50};
		
		int[] numsCopy = Arrays.copyOf(nums, nums.length);
		//	int[] numsCopy = Arrays.copyOf(nums, 2);
		
		System.out.println("nums[] : "+Arrays.toString(nums));		
		System.out.println("numsCopy[] :"+Arrays.toString(numsCopy));
}
}
