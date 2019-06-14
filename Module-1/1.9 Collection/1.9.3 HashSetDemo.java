package com.fundamentals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add("Tops");
		hs.add('T');
		hs.add(null);
		hs.add(10);
		hs.add(true);
		System.out.println(hs);
		System.out.println("Size : "+hs.size());
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println("Ele : "+obj);
		}
		
	}
}
