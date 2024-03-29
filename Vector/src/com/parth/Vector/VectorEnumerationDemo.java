package com.parth.Vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEnumerationDemo {
	
	public static void main(String[] args) {
		
		Vector vector = new Vector<>();
		
		vector.add("AAA");
		vector.add("BBB");
		vector.add("CCC");
		vector.add("DDD");
		vector.add("EEE");
		
		
		Iterator itr = vector.iterator();
		
		while(itr.hasNext())
		{
			String exp = (String) itr.next();
			if(exp.equals("CCC"))
			{
				itr.remove();
				vector.remove(2);
			}
		}
		
		ListIterator ltr = vector.listIterator();
		
		while(ltr.hasNext())
		{
			String exp = (String ) ltr.next();
			if(exp.equals("CCC"))
			{
				itr.remove();
				vector.remove(2);
			}
		}
		
	}

}
