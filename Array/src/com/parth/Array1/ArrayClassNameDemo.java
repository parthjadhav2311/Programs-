package com.parth.Array1;

import com.parth.Array.Student;

public class ArrayClassNameDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int nums1[] = {10,20,30,40,50};
		char nums2[] = {10,20,30,40,50};
		short nums3[] = {10,20,30,40,50};
		byte nums4[] = {10,20,30,40,50};
		long nums5[] = {10,20,30,40,50};
		float nums6[] = {10,20,30,40,50};
		double nums7[] = {10,20,30,40,50};
		boolean nums8[] = {true,false,true};
		
		
		Integer nums9[] = {10,20,30,40,50};
		String nums10[] = {"Hii","Sai","07"};
		Object nums11[] = {07,"Hello",30,40,50};
		
		Student s1 = new Student(7,"Parth");
		Student s2 = new Student (8,"Sai");
		Student s3 = new Student (9,"Rahul");
		
		Student nums12[] = {s1,s3,s2};
		
		System.out.println("int[] :"+nums1.getClass().getName());
		System.out.println("char[] :"+nums2.getClass().getName());
		System.out.println("short[] :"+nums3.getClass().getName());
		System.out.println("byte[] :"+nums4.getClass().getName());
		System.out.println("long[] :"+nums5.getClass().getName());
		System.out.println("float[] :"+nums6.getClass().getName());
		System.out.println("double[] :"+nums7.getClass().getName());
		System.out.println("boolean[] :"+nums8.getClass().getName());
		
		
		System.out.println("Integer[] :"+nums9.getClass().getName());
		System.out.println("String[] :"+nums10.getClass().getName());
		System.out.println("Object[] :"+nums11.getClass().getName());
		System.out.println("Student[] :"+nums12.getClass().getName());
	
		
		System.out.println("Main ended");
		
	}

}
