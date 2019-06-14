package com.fundamentals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("Tops");
		al.add('T');
		al.add(true);
		al.add(null);
		al.add(10);
		al.add(10);
		System.out.println(al);
		System.out.println("Size Of List : "+al.size());
		al.remove(1);
		System.out.println(al);
		System.out.println("Size Of List : "+al.size());
		System.out.println(al.get(3));
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println("Ele : "+obj);
		}
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			Object obj=litr.next();
			litr.set(obj+" Tops");
		}
		
		System.out.println("After Modified Content");
		litr=al.listIterator();
		while(litr.hasNext())
		{
			Object obj=litr.next();
			System.out.println("Ele : "+obj);
		}
		
		System.out.println("Reverse Order");
		while(litr.hasPrevious())
		{
			Object obj=litr.previous();
			System.out.println("Ele : "+obj);
		}
	
		
	}
}
