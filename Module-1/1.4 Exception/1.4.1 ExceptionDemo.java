package com.fundamentals;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		try
		{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 and n2:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		
		int sum=n1+n2;
		System.out.println("Sum is:"+sum);
		
		int div=n1/n2;
		System.out.println("Division is:"+div);
	
		}
		catch(Exception e)
		{
			System.out.println("Exception is:"+e);
			//e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		System.out.println("End of program");
	}

}
