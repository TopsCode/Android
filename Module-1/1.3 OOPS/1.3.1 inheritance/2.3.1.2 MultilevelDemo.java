package PraticeProgram;


class Base1{
	
	void basemeth1(){
		
		System.out.println("Base1 Class Method Called!");
	}
}

class Base2 extends Base1{
	
	void basemeth2(){
		
		System.out.println("Base2 Class Method Called!");
	}
}

class Derived2 extends Base2 {
	
	void derivedmeth(){
		
		System.out.println("Derived Class Method Called!");
	}
}

public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived2 d =  new Derived2();
		d.basemeth1();
		d.basemeth2();
		d.derivedmeth();

	}

}
