package com.fundamentals;
class AddTwoNumbers
{
	int n1,n2;
	public AddTwoNumbers() {
		this(10,20);
	System.out.println("Default const called");
	}
	public AddTwoNumbers(int n1,int n2) {
		//this();//call default
		System.out.println("Parametrized const called");
		this.n1=n1;
		this.n2=n2;
	}
	int multino(AddTwoNumbers obj) {
		int mul=obj.n1*obj.n2;
		return mul;
	}
	void disp_result()
	{
		System.out.println("n1:"+n1+"   n2:"+n2);
		System.out.println("Addition is:"+this.addno());
		System.out.println("Multiplication is:"+this.multino(this));
	}
     int addno() {
		int total;
		total=n1+n2;
		return total;
	}
}
public class ThisKeyword_Demo {

	public static void main(String[] args) {
		AddTwoNumbers obj1=new AddTwoNumbers();	
		//AddTwoNumbers obj=new AddTwoNumbers(10,20);	
		obj1.disp_result();
	}

}
