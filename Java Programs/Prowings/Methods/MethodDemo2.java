package Methods;

public class MethodDemo2 {
	
	public static void addition(int a, int b)
	{
		int result = a + b;
		
	    System.out.println(result);
	}
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		addition(10,20);
		
		System.out.println("main method ended!!");
	}

}
