package com.fundamentals;

public class MultiplaCatchDemo {

	public static void main(String[] args) {
		try
		{
		int a[]=new int[3];
		
		a[0]=10;
		a[1]=20;
		a[2]=0;
		
		int sum=a[0]+a[1];
		System.out.println("Sum of 0th and 1st index value:"+sum);
		
		int div=a[1]/a[2];
		System.out.println("Div of 1st and 2nd index value is:"+div);
		
		int sub=a[1]-a[3];
		System.out.println("Sub of 1st and 3rd index is:"+sub);
		}
		catch(ArithmeticException e1)
		{
			e1.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			e2.printStackTrace();
		}
		System.out.println("End of the program");

	}

}
