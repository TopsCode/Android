package PraticeProgram;

abstract class Mobile1 {

	abstract void sim();
	
	void sim2(){
		
	}
}

class Mobile2 extends Mobile1{

	@Override
	void sim() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Mobile2 Sim Method Called!");
		
	}
	
	
}
public class abstractclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Mobile2 m = new Mobile2();
		m.sim();
	}

}
