package com.parth.FileHandling;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("abc.txt");
		
		if(file.createNewFile())
			System.out.println("File Created Sucessfully!!");
		else
			System.out.println("File already Present!!");
	}
}
