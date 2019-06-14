package PraticeProgram;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Enumeration days;
		Vector v =  new Vector();
		
		v.add("Monday");
		v.add("Tuesday");
		v.add("Wendesday");
		v.add("Thursday");
		v.add("Friday");
		v.add("Saturday");
		
		System.out.println(v);
		
		days = v.elements();
		while(days.hasMoreElements()){
			
			System.out.println(days.nextElement());
		}

	}

}
