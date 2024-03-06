package Methods;

public class ReturnTypeMethod {

	public int addition(int a, int b) {
		System.out.println("addition method started!!!");
		int res = a + b;

		System.out.println("addition method ended!!!");

		return res;
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} 
		else 
		{
			return false;
		}

	}

	public static void print(int number) {
		System.out.println("Numbe is : " + number);
	}

	static public void main(String[] args) {

		System.out.println("main method started!!!");

		ReturnTypeMethod obj = new ReturnTypeMethod();

		int returnedValue = obj.addition(10, 30);

		System.out.println(">>> Addition is : " + returnedValue);

		int number = 7;
		

		if (isEvenNumber(number)) 
		{
			print(number);
		}

		System.out.println("main method ended!!!");
	}

}	