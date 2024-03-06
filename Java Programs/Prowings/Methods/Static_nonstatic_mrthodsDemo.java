package Methods;

public class Static_nonstatic_mrthodsDemo {
	
	public void m1()
	{
		System.out.println("m1() method started");
		
		m3();
		System.out.println("m1() method ended");
	}
	public static void m2()
	{
		System.out.println("Inside m2() started");
	}
	
	public void m3()
	{
		System.out.println("Inside m3() method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main() started!!");
		Static_nonstatic_mrthodsDemo obj = new Static_nonstatic_mrthodsDemo();
		obj.m1();
		System.out.println("main() ended!!");
	}

}
