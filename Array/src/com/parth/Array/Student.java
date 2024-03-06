package com.parth.Array;

public class Student {
	 public int roll_no;
	    public String name;
	    public Student(int roll_no, String name)
	    {
	        this.roll_no = roll_no;
	        this.name = name; 
	    }
	
	
	public static void main(String[] args)
    {
        
        Student[] array;
 
       
        array = new Student[5];
 
        
        array[0] = new Student(1, "Parth" ) ;
        array[1] = new Student(2, "vaibhav");
        array[2] = new Student(3, "Pramod");
        array[3] = new Student(4, "Sai");
        array[4] = new Student(5, "Atul");
 
       
        for (int i = 0; i < array.length; i++)
            System.out.println("Student " + i + " : "
                               + array[i].roll_no + " "
                               + array[i].name);
    }
}