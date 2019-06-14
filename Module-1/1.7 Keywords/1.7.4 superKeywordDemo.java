package com.fundamentals;
class Animal
{
	String color="white";
	public Animal() {
	     System.out.println("Default of Animal super class");
	}
	void walk()
	{
		System.out.println("Animal can walk");
	}
}
class Tiger extends Animal
{
	String color="YellowBlack";
	public Tiger() {
		System.out.println("Default of Tiger sub class");
	}
	void dispColor()
	{
		System.out.println("Color of animal super class:"+super.color);
		System.out.println("Color of Tiger sub class:"+color);
		super.walk();
	}
}
public class superKeywordDemo {

	public static void main(String[] args) {
	Tiger t1=new Tiger();
	t1.dispColor();

	}

}
