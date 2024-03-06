package com.parth.Array1;

import java.util.Arrays;

public class ArrayEquality {
	
	public static void main(String[] args) {
		
		int[] nums1 = {10,30,20,50};
		int[] nums2 = {10,300,20,50};
		
		if(Arrays.equals(nums1, nums2))
			System.out.println("Equals Arrays!!");
		else
			System.out.println("Not equal Arrays!!!");
		
		int hs = Arrays.hashCode(nums1);
		
		System.out.println(hs);
		System.out.println(nums1.hashCode());
	}

}
