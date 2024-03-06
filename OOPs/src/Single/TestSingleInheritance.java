package Single;

public class TestSingleInheritance {

	public static void main(String[] args) {
		
	//	Child obj = new Child();
		
       Parent obj = new Parent(); 
       
  //     obj.printHi();
         obj.printHello();
         
         obj.a = 10;
         obj.b = 20;
         
         System.out.println(obj.a);
         System.out.println(obj.b);
	}
}
