package PraticeProgram;

class Student2{
	
	int id;
	String name;
	
	Student2(int i,String n){
		
		id = i;
		name = n;
	}
	
	Student2(Student2 s){
		
		id = s.id;
		name = s.name;
	}
	
	void display(){
		
		System.out.println(id+" " +name);
	}
}

public class copyconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s1 = new Student2(8,"Sunit Jha");
		Student2 s2 = new Student2(s1);
		
		s1.display();
		s2.display();
	}

}
