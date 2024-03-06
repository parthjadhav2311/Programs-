package com.parth.FileHandling;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

public static void main(String[] args) throws IOException {
		
		File file = new File("ab.txt");
		
		if(file.createNewFile())
			System.out.println("File Created Sucessfully!!");
		else
			System.out.println("File already Present!!");
		
		if(file.delete())
			System.out.println("File delete Sucessfully!!");
		else
			System.out.println("File already Present!!");
		
	}
}

