package Methods;

public class MethodDemo {
	
	
	public static void print() //method declaration
	{
		
		System.out.println("print method started!!");
		System.out.println("Hii");
		print2();
		System.out.println("print method ended!!");
		
	}

	public static void print2()
	{
		System.out.println("print2 method started!!");
		System.out.println("Hello");
		
		print2();
		System.out.println("print2 method ended!!");
	}

	
	public static void main(String[] args) {
		
		int i = 10;
		Integer j = 20;
		
		System.out.println("main method started!!");
		
		print(); //method invocation
		
		System.out.println("main method ended!!");
		
	}

}