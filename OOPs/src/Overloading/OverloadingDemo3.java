package Overloading;

import Heirarchical.A;
import Heirarchical.B;
import Heirarchical.C;
/**
 * @author 
 * 
 */
public class OverloadingDemo3 {

	public void m1(A a)
	{
		System.out.println("m1(A a)");
	}

	public void m1(Object a)
	{
		System.out.println("m1(Object a)");
	}

	public void m1(B a)
	{
		System.out.println("m1(B a)");
	}

	public void m1(C a)
	{
		System.out.println("m1(C a)");
	}

	public void m1(String a)
	{
		System.out.println("m1(String a)");
	}

	public void m11(B a)
	{
	System.out.println("m1(B1 a)");
	}

	
	public static void main(String[] args) {
		
		OverloadingDemo3 demo = new OverloadingDemo3();
		
		C c =  new C();
		
		Integer i = 20;
		
		demo.m1(i); 
		
	}
	
}