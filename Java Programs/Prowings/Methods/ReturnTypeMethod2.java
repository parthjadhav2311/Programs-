package Methods;

public class ReturnTypeMethod2 {
	
	public int addition(int a, int b)
	{
		System.out.println("Addition method started!!!");
		int res = a + b;
		
		System.out.println("Addition method ended!!");
		
		return res;
		
	}
	public int square(int a)
	{
		System.out.println("Square method started!!!");
		int res = a * a;
		System.out.println("Square method ended");
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method started!!");
		
		ReturnTypeMethod2 obj = new ReturnTypeMethod2();
		
		int addition_result = obj.addition(10, 30);
		
		System.out.println(">>>Addition is : "+addition_result);
		
		int squareRes = obj.square(addition_result);
		
		System.out.println(">>> Square is : "+squareRes);
		
		System.out.println("Main method ended!!");
	}
	

}
