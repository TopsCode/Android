package com.fundamentals;

import java.sql.DriverManager;

interface Demo1
{
	abstract void disp();
}
class Sample1 implements Demo1
{
	@Override
	public void disp() {
		System.out.println("This is abstract method");	
	}
}
class Sample2 extends Sample1
{
	public void disp() {
		System.out.println("This is abstract method");	
	}
}
interface Demo2 extends Demo1
{
	abstract void disp2();
}
class Sample3 implements Demo2
{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
	Sample1 s1=new Sample1();
	s1.disp();
	}

}
