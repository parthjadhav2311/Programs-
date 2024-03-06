package com.parth.Array1;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int[] nums = {10,03,40,15,10,40,50};
		
		printEvenNumbersFromGivenArray(nums);
		
		int[] nums1 = {10,20,30};
		int[] nums2 = {40,50};
		
		int[] res = mergeTwoArrays(nums1,nums2);
		
		System.out.println("Main Ended");
		
	}
	
	public static void printEvenNumbersFromGivenArray(int[] nums) {
		System.out.println("printEvenNumbersFromGivenArray() started");
		for(int n : nums)
		{
			if(n%2 == 0)
				System.out.println(n + " is Even Number");
			else
				System.out.println(n + " is Odd Number");
		}
		System.out.println("printEvenNumbersFromGivenArray() ended");
	}

	public static int[] mergeTwoArrays(int[] nums1, int[] nums2) {
		
		int[] result = new int[nums1.length + nums2.length];
		
		int memory = 0;
		for(int i=0;i<nums1.length;i++)
		{
			result[memory] = nums1[i];
			memory++;
		}
		
		for (int j=0; j<nums2.length;j++)
		{
			result[memory] = nums2[j];
			memory++;
		}
		return result;
	}

	
}
