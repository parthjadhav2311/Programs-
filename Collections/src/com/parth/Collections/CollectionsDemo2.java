package com.parth.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.parth.Arraylist.Person;
import com.parth.Arraylist.Student;

public class CollectionsDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("ccc");
		myList.add("ccc");
		
		
		System.out.println(myList);
		
		Collections.sort(myList);

		System.out.println("After Sorting : " + myList);
		
		int index = Collections.binarySearch(myList, "ddd");
		
		System.out.println("Element Found at index : " + index);
		
		Student s1 = new Student(10,"aaa","Pune");
		Student s2 = new Student(30,"ccc","Kolhapur");
		Student s3 = new Student(60,"xxx","mumbai");
		
		Student[] stdArr = {s3,s1,s2};
		
		List<Student> stdList = Arrays.asList(stdArr);
		
		System.out.println("Before sorting : " + stdList);
		Collections.sort(stdList);
		System.out.println("After sorting : " + stdList);
		
		int indexOfStudent = Collections.binarySearch(stdList, s1);
		
		System.out.println("Specified Student present at index = "+ indexOfStudent);
		
		Person p1 = new Person("aaa","Mumbai");
		Person p2 = new Person("bbb","Dubai");
		Person p3 =  new Person ("ccc","Chennai");
		
		LinkedList<Person> personList = new LinkedList<>();
		
		personList.add(p3);
		personList.add(p1);
		personList.add(p2);
		
		System.out.println("Before Sorting By Name : "+ personList);
		Collections.sort(personList, new PersonNmaeComparator());
		System.out.println("After Sorting By Name : "+ personList);
		
		int indexOfPerson = Collections.binarySearch(personList, p1,new PersonNameComaparator());
		
		System.out.println("Specified Person presnt at inde: "+ indexOfPerson);
		
		System.out.println("Before sorting by address : "+personList);
	     Collections.sort(personList, new PersonAddressComparator());
	    System.out.println("After Sorting by address : "+personList);
		
		
		
		
	}

}
