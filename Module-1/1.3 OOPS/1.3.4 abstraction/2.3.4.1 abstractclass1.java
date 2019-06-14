package PraticeProgram;


abstract class fun{
	
	void getfun(){
		
		System.out.println(" Get Fun  method");

	}

	abstract void showfun();
}

class fun2 extends fun{

	@Override
	void showfun() {
		// TODO Auto-generated method stub
		
		System.out.println("Fun 2 Method");
		
	}
	
	
}

public class abstractclass1 {
	// abstract void fun();

	public static void main(String args[]) {
		
		
		fun2 f = new fun2();
		
		f.showfun();
		f.getfun();

	}

}
