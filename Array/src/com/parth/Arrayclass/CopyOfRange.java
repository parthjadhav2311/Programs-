package com.parth.Arrayclass;

import java.util.Arrays;

public class CopyOfRange {
	
	public static void main(String[] args) {
		
		int intArr[] = {10,20,15,22,35};
		
		System.out.println("Integer Array : "
				           + Arrays.toString(intArr));
		
		System.out.println("\nNew Arrays by copyOfRange:\n");
		
		System.out.println("Intger Array: "
				         + Arrays.toString(
				        		Arrays.copyOfRange(intArr, 1, 3)));
	}

}
