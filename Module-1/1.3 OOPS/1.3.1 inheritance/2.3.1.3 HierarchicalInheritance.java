package PraticeProgram;

import java.util.Scanner;

class A2{
	
	int a;
	void getA(){
		
		System.out.println("Class GetA method Called!");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the value for A :");
		a = sc.nextInt();
	}
	
	
	void putA(){
		System.out.println("Class putA method Called!");
		System.out.println(" A : "+a);
	}
}

class B2 extends A2{
	
	int b;
	void getB(){
		System.out.println("Class GetB method Called!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of B : ");
		b = sc.nextInt();
	}
	
	
	void putB(){
		System.out.println("Class putB method Called!");
		System.out.println(" B : "+b);
	}
}


class C2 extends A2{
	
	
	int c;
	void getC(){
		System.out.println("Class GetC method Called!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of C : ");
		c = sc.nextInt();
	}
	
	
	void putC(){
		System.out.println("Class putC method Called!");
		System.out.println(" C" + " : "+c);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A2 a = new A2();
		B2 b = new B2();
		C2 c = new C2();
		
		
		b.getA();
		b.getB();
		c.getC();
		
		c.putA();
		b.putB();
		c.putC();
	}
	

}
