package com.fundamentals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap<>();
		map.put(1,"Abhishek");
		map.put(2,"Sunit");
		map.put(3,"Shena");
		map.put(4,"Purti");
		map.put(5,"Krishna");
		System.out.println(map);
	
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.print("Key : "+entry.getKey());
			System.out.println(" Value : "+entry.getValue());
		}
		
	}
}
