package PraticeProgram;

class Department {

	Department() {

		System.out.println("Default Constructor of A: ");
	}

	void show() {

		System.out.println("Class A show method called");
	}

}

class Sales extends Department {

	Sales() {

		System.out.println("Default Contructor of B: ");
	}

	void show() {

		super.show();
		System.out.println("Class B show method called");
	}
}

class Account extends Sales {

	Account() {
		System.out.println("Default Contructor of C");
	}

	void show() {

		super.show();
		System.out.println("Class C show method called");
	}
}

public class conschaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account();
		//2c.show();

	}

}
