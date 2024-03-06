package com.parth.Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Remove_key_value_pair_HashMap {

	public static void main(String[] args) 
    {
         
         
        HashMap<String, String> map = new HashMap<String, String>();
         
       
         
        map.put("ONE", "AAA");
         
        map.put("TWO", "BBB");
         
        map.put("THREE", "CCC");
         
        map.put("FOUR", "DDD");
         
        map.put("FIVE", "EEE");
         
       
         
        System.out.println("HashMap Before Remove :");
         
        Set<Entry<String, String>> keyValueSet = map.entrySet();
         
        for (Entry<String, String> entry : keyValueSet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
         
        System.out.println("------------------");
         
       
         
        map.remove("ONE", "CCC");
         
      
         
        map.remove("FIVE", "EEE");
         
        System.out.println("HashMap After Remove :");
         
        for (Entry<String, String> entry : keyValueSet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }   
	
}
