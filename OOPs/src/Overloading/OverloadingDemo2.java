package Overloading;

public class OverloadingDemo2 {
	
	public static void m1(Integer a)
	{
		System.out.println("m1(Integer a)");
	}
	
	public int m1(Object a)throws RuntimeException
	{
	   System.out.println("m1(Object a)");
		return 10;
	}
	
	public static void main(String[] args) {
		OverloadingDemo2 demo = new OverloadingDemo2();
		demo.m1(10);
	}

}
