package com.application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> hmap = new HashMap<>();
		
		hmap.put(123, "XYZ");
		hmap.put(232, "PQR");
		hmap.put(566, "ABC");
		hmap.put(543, "LMN");
		hmap.put(123, "ABC");
		
		System.out.println("All entries in hmap are : ");
		for(Map.Entry entr : hmap.entrySet())
		{
			System.out.println(entr.getKey()+" : "+entr.getValue());
		}
		
		System.out.println("Value associated with key 543 is : "+
							hmap.get(543));
		
		System.out.println("Is key 999 present in hmap : "+
							hmap.containsKey(999));
		
		System.out.println("Is value ABC present in hmap : "+
				hmap.containsValue("ABC"));
		
		hmap.remove(123);
		
		hmap.remove(543, "ANIL");
		
		System.out.println("after removal , all keys in hmap are : ");
		for(Integer k : hmap.keySet())
			System.out.println(k);
		
	Map<Integer,String> tmap = new TreeMap<>();
		
		tmap.put(123, "XYZ");
		tmap.put(232, "PQR");
		tmap.put(566, "ABC");
		tmap.put(543, "LMN");
		tmap.put(123, "ABC");
		
		System.out.println("All entries in tmap are : ");
		for(Map.Entry entr : tmap.entrySet())
		{
			System.out.println(entr.getKey()+" : "+entr.getValue());
		}
		
		
	}
}












