package com.parth.Array1;

import java.util.Arrays;

public class ArraysUtilityClassMethodsDemo {

	private static int element;

	public static void main(String[] args) {
		
		int[] nums = {10,40,20,60,30,50};
		
		sortArray(nums);
		System.out.println("Afer sorting Array :" + Arrays.toString(nums));
		
		searchElements(nums,200);
	}

	private static void searchElements(int[] nums, int i) {
		// TODO Auto-generated method stub
		
	}

	public static void sortArray(int[] nums) {
	  
		 int index = Arrays.binarySearch(nums, element);
		 
		 if(index >= 0)
			 System.out.println("Element found in given array at index :"+index);
		 else
			 System.out.println("Element is not found in given array!!");
			 
	}
	
	public static void sortArray1(int[] nums) {
		System.out.println("Original Array : " + Arrays.toString(nums));
		
		//Arrays.sort(nums);
		  Arrays.parallelSort(nums);
	}
}
