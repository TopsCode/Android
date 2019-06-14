package com.fundamentals;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputStreamDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("test.txt");
		    String str="This is file io program";
		    byte b[]=str.getBytes();
		    
		    fout.write(b);
		    fout.flush();
		    fout.close();
		    System.out.println("Data write sucessfully");
		    
		    FileInputStream fin=new FileInputStream("test.txt");
		    int i;
		    while((i=fin.read())!=-1)
		    {
		    	System.out.print((char)i);
		    }
		    fin.close();
		    System.out.println();
		    System.out.println("Data read successfully");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}
