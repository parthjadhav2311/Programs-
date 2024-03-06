package com.parth.Array1;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int[] nums = new int[50];
		int value = 1;
		System.out.println("Length of nums[] :" + nums.length);
		
		for(int i = 0; i < nums.length; i++)
		{
			nums [i] = value;
			value++;
		}
		
		System.out.println(">>>>>>>>>>>PRINTING ARRAY <<<<<<<<<");
		
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		
		System.out.println(">>>>>>>>PRINTING ARRAY IN REVERSE<<<<");
		
		for(int i=nums.length-1;i>=0;i--)
		{
			System.out.println(nums[i]);
		}
		System.out.println("Main ended");
	}

}
