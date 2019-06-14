package com.fundamentals;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterClassDemo {

	public static void main(String[] args) {
    FileWriter fw;
	try {
		fw = new FileWriter("test1.txt");
		String str="This is file io reader writer program";
	    fw.write(str);
	    fw.flush();
	    fw.close();
	    System.out.println("Data write successfully");
	    System.out.println();
	    
	    FileReader fr=new FileReader("test1.txt");
	    int i;
	    while((i=fr.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
	    fr.close();
	    System.out.println();
	    System.out.println("Data read successfully");
		    
	} catch (Exception e) {
	
		e.printStackTrace();
	}
   

	}

}
