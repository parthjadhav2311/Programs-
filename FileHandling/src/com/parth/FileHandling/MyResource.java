package com.parth.FileHandling;

public class MyResource implements AutoCloseable{
	
@Override	
 public void close() throws Exception {
	 
		 System.out.println("Close mwthod invoked on MyResource!!");
	 }
 }
 

