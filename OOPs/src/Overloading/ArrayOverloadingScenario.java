package Overloading;

public class ArrayOverloadingScenario {	
	
	public static void test(int... intVarArg) {
		System.out.println("int var-arg");
		
		for(int n : intVarArg)
			System.out.println(n);
    }
	
	public static void test(long[] longArr) {
		System.out.println("long array");
	}
	
    public static void test(char[] charArr) {
    	System.out.println("char array");
    }

     public static void main(String[] args) {
    	 int[] nums = {1,2,3,4,5,6,7};
    	 test(nums);
    	// test(null);
     }
}
