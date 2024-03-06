package com.parth.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationCompositionDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Head head = new Head("ZZZ",123456);
		Engine engine = new Engine("ABC",2.5f,head);
		Car car = new Car("Audi",2023, engine);
		
		System.out.println("Car Object to be serialized : " + car);
		
		File file = new File ("CarCompostion.txt");
		
		
		//Serialization
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(car);
		System.out.println("Object written to file sucessfully!!");
		
		//Deserialization
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		Car deserializedCar = (Car) ois.readObject();
		
		System.out.println("Car Object After Deserialization : " + deserializedCar);
		
		
		
	}

}
