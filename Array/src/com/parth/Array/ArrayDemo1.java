package com.parth.Array;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		int nums[] = {10,20,30,40,50,60,70};
		
		for(int n : nums)
		{
			System.out.println(n);
		}
		
		System.out.println(nums.getClass().getName());
		
		System.out.println("Main Method Ended");
		
	}

}
