package com.parth.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapClear {
	
	public static void main(String[] args) {
		
		Map<Integer ,String > map = new HashMap<Integer ,String>();
		
		map.put(1, "Parth");
		map.put(2, "7");
		map.put(8, "Sai");
		map.put(7, "Welcome");
		map.put(35, "You");
		
		System.out.println("Initial Mappings are: " + map);
		
		map.clear();
		
		System.out.println("Finally the maps look like this: " + map);
	}

}
