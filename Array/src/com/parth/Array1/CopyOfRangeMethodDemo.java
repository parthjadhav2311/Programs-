package com.parth.Array1;

import java.util.Arrays;

public class CopyOfRangeMethodDemo {
	
	public static void main(String[] args) {
		
		int[] nums = {10,30,20,50};
		
		int[] numsCopy = Arrays.copyOfRange(nums, 1, 3);
		
		System.out.println("nums[] : "+Arrays.toString(nums));
		System.out.println("numsCopy[] : "+Arrays.toString(numsCopy));
	}

}
