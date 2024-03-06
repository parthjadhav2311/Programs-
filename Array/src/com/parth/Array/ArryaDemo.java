package com.parth.Array;

public class ArryaDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		
		
		 int nums1[] = new int[10];
		 char nums2[] = {10,20,30,40,50};
		 short nums3[] = {10,20,30,40,50};
		 Byte nums4 [] = {10,20,30,40,50};
		 long nums5[] = {10,20,30,40,50};
		 float nums6[] = {10,20,30,40,50};
		 double nums7[] = {10,20,30,40,50};
		 boolean nums8[] = {true,false,true};
		 
		 Integer nums9[] = {10,20,30,40,50};
		 String nums10[] = {"Hii" ,"Sai", "Shraddha"};
		 Object nums11[] = {07,"Hello",07,23,11};
		 
		 
		 Student s1 = new Student(07,"Parth");
		 Student s2 = new Student(11,"Sai");
		 Student s3 = new Student (47,"Arati");
		 Student nums12[] = {s1,s2,s3};
		 

		 System.out.println(nums1.getClass().getName());
		 System.out.println(nums2.getClass().getName());
		 System.out.println(nums3.getClass().getName());
		 System.out.println(nums4.getClass().getName());
		 System.out.println(nums5.getClass().getName());
		 System.out.println(nums6.getClass().getName());
		 System.out.println(nums7.getClass().getName());
		 
		 System.out.println(nums8.getClass().getName());
		 System.out.println(nums9.getClass().getName());
		 System.out.println(nums10.getClass().getName());
		 System.out.println(nums11.getClass().getName());
		 System.out.println(nums12.getClass().getName());
		 
		 
		 System.out.println("Main Method Ended");
		
		
	}

}
