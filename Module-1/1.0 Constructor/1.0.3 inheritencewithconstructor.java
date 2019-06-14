package PraticeProgram;

class Base{
	
	Base(){
		
		System.out.println("Constructor of Base class");
	}
	
	void basemeth(){
		
		System.out.println("Base Class Method Called!");
	}
}


class Derived extends Base{
	
	Derived(){
		
		System.out.println("Constructor of Derived Class");
	}
}
public class inheritencewithconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived d1 = new Derived();
		d1.basemeth();
	}

}
