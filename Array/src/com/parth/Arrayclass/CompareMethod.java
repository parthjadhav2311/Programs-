package com.parth.Arrayclass;

// compare(array 1, array 2) Method 

import java.util.Arrays;

public class CompareMethod {

	public static void main(String[] args) {
		
		int intArr[] = {10,20,15,22,35};
		
		int intArr1[] = {10,15,22};
		
		System.out.println("Integer Arrays on comparison:"
				            + Arrays.compare(intArr,intArr1 ));
	}
}
