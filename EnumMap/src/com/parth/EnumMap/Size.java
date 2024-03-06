package com.parth.EnumMap;

public strictfp enum  Size {
	
	SMALL(28), MEDIUM(32), LARGE(42), EXTRALARGE(44);
	
   int size;
   
   Size(int size)
   {
	   this.size = size;
	   
   }
   
   public int getSize()
   {
	   return this.size;
   }
   
   public double calculatorprize()
   {
	   return this.getSize() * 20;
   }
   

}
