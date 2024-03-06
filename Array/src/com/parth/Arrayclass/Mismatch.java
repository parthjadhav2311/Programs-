package com.parth.Arrayclass;

import java.util.Arrays;

public class Mismatch {

	public static void main(String[] args) {
		
		int intArr[] = { 10, 20 ,15,22,35};
		
		int intArr1[] = {10,15,22};
		
		System.out.println("The element mismatched at index: "
				           + Arrays.mismatch(intArr, intArr1));
	}
}
