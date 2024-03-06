package blocks;

public class BlockEx1 {
	
	public static void addition(int a, int b) {
		 int res = a + b;
		 System.out.println("Addition of two numbers is : " + res);
	}
	
	{
		System.out.println("Inside Instance Block-11");
	}
	
	{
		System.out.println("Inside Instance Block-22");
	}
	
	public BlockEx1()
	{
		System.out.println("Inside No-arg Constructor!!");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside main!!");
		
		addition(3,10);
		
		BlockEx1 obj = new BlockEx1();
	}

}
