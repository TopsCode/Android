package PraticeProgram;

class Employee {
	float sal = 40000;
	
}

class details extends Employee {
	void totsal() {
		float bonus = 2000;
		int sum = (int) (sal+bonus);
		System.out.println("Employee Total Salary : "+sum);
	}

}

public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		details d1 = new details();
		
		d1.totsal();
		
		
	}

}
