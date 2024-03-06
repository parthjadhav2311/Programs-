package com.parth.Set;

import java.util.HashSet;

public class Test3 {
	
       public static void main(String[] args) {
		
    	   Employee emp1 = new Employee(07,"Parth");
    	   Employee emp2 = new Employee(11,"Sai");
    	   Employee emp3 = new Employee(9,"Ayush");
    	   
    	   System.out.println(emp1 == emp3);
    	   System.out.println(emp1.equals(emp3));
    	   
    	   HashSet hs = new HashSet();
    	   
    	   hs.add(emp1);
    	   hs.add(emp2);
    	   hs.add(emp1);
    	   
    	   System.out.println(hs);
    	   
	}

}
