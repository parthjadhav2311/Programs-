package com.parth.Arrayclass;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int intArr[] = {10,20,15,22,35};
		
		Arrays.sort(intArr);
		
		int intkey = 22;
		
		System.out.println(
				intkey + "found at index = "
				 + Arrays.binarySearch(intArr, intkey));
	}

}
