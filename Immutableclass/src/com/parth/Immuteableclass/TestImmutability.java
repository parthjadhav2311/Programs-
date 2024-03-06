package com.parth.Immuteableclass;

public class TestImmutability {
	
	public static void main(String[] args) {
		
		Address addr = new Address(123,"Parth","India");
		
	    ImmutableStudent s = new ImmutableStudent(10,"Sai",addr);
	    
	    System.out.println("Before modification : "+ s);
	    
	    addr.setCity("Mumbai");
	    
	    s.getAddress().setCity("Mumbai");
	    
	    System.out.println("After modification : "+ s);
	}

}
