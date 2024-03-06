package blocks;

public class Parent {
	
	{
		System.out.println("inside instance block-111 - Parent");
	}
	
	public Parent()
	{
		super();
		System.out.println("inside Parent() no-arg constructor!!");
	}

	static
	{
		System.out.println("inside static block-111 - Parent");
	}
}