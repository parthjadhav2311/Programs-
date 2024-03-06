package blocks;



public class TestBlock extends Parent{

	// static block
	static {
		System.out.println("inside static block-2222!!!");
	}
	
	// no-arg constructor
	public TestBlock() {
		super();
		System.out.println("inside TestBlock() no-arg constructor!!");
	}

	// instance block
	{
		System.out.println("inside instance block-111!!!");
	}

	// static block
	static {
		System.out.println("inside static block-1111!!!");
	}
	
	// instance block
	{
		System.out.println("inside instance block-222!!!");
	}


	public static void printHello() // static method
	{
		System.out.println("inside printHello()");
	}

	public void printHii() // instance method
	{
		System.out.println("inside printHii()");
	}

	public static void main(String[] args) {

		System.out.println("inside main method!!");


		TestBlock obj1 = new TestBlock();

		printHello();
		obj1.printHii();

	}

}