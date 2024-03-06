package com.parth.Array1;

import java.util.Arrays;

public class ArraysUtilityClassMethodsDemo2 {
	
	public static void main(String[] args) {
		
	 int[] nums = new int[10];
	 String[] words = {"aaa","bbb","ccc"};
	 
	 System.out.println(Arrays.toString(nums));
	 System.out.println(Arrays.toString(words));
	 
	 Arrays.fill(nums, 5);
	 System.out.println("After fill : " + Arrays.toString(nums));
	
	 Arrays.fill(words, "hello");
	 System.out.println("After fill : "+Arrays.toString(words));
	}

}
