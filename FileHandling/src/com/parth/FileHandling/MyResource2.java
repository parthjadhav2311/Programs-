package com.parth.FileHandling;

public class MyResource2 implements AutoCloseable {
	
	@Override
	
	public void close() throws Exception {
		
		System.out.println("Close method invoked on MyResource2!!");
	}

}
