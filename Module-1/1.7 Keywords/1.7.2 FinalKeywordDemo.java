package com.fundamentals;
  class Sample
{
	 static final int a;
	 final int b;
	public Sample()
	 {
		 b=100;
	 }
	static
	{
		a=2000;
	}
     //final void msg1()
	//{
		//System.out.println("This is msg1() method of Sample class");
	//}
}
class Sub extends Sample
{
	void msg1()
	{
		System.out.println("This is msg1() method of sub class");
	}
	void msg2()
	{
		System.out.println("This is msg2() method of Sub class");
	}
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
    Sub obj=new Sub();
    obj.msg1();
    obj.msg2();

	}

}
