package com.parth.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.parth.Arraylist.Person;
import com.parth.Arraylist.Student;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Before Sorting : "+myList);
		
	     Collections.sort(myList);
	     
	     System.out.println("After Sorting : "+myList);
	     
	     Student s1  = new Student(10,"aaa","Pune");
	     Student s2 = new Student(30,"ccc","Kolhapur");
	     Student s3 = new Student(60,"xxx","Mumbai");
	     
	    
	   Student[] stdArr = {s3,s2,s1};
	   
	   List<Student> stdList = Arrays.asList(stdArr);
	   
	   System.out.println("Before Sorting : " +stdList);
	   Collections.sort(stdList);
	   System.out.println("After Sorting : "+stdList);

	   Person p1 = new Person("aaa","Mumbai");
	   Person p2 = new Person("bbb","Dubai");
	   Person p3 = new Person("CCC","Chennai");
	   
	   LinkedList<Person> personList = new LinkedList<>();
	   
	   personList.add(p3);
	   personList.add(p1);
	   personList.add(p2);
	   
	   System.out.println("Before Sorting By Nmae : " + personList);
	   Collections.sort(personList, new  PersonNmaeComparator());
	   System.out.println("After Sorting By Name : " + personList);
	   
	   System.out.println("Before Sorting By address : " + personList);
	   Collections.sort(personList, new PersonAddressComparator());
	   System.out.println("After Sorting By address: " + personList);
		
		
	}
}
