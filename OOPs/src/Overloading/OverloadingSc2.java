package Overloading;

public class OverloadingSc2 {
	
	void m1(int i)
	{
		System.out.println("int");
	}

	 void m1(long i)
	 {
		 System.out.println("long");
	 }
	 
	 public static void main(String[] args) {
		
		 OverloadingSc2 obj = new OverloadingSc2();
		 
		 obj.m1(99999999);
	 }
}
