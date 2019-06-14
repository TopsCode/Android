package com.fundamentals;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class fileio_bytearrayoutputstreamDemo {

	public static void main(String[] args) {
		try
		{
			  FileOutputStream fout1=new FileOutputStream("D:\\Nivedita_Java\\filein.txt");    
		      FileOutputStream fout2=new FileOutputStream("D:\\Nivedita_Java\\fileout.txt");    
		        
		      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
		      String s="Welcome to ByteArrayOutputStream Class.";    
			  byte b[]=s.getBytes();    
			  bout.write(b); 
			  bout.writeTo(fout1); 
		      bout.writeTo(fout2);    
		        
		      
		      bout.close();//has no effect    
		      System.out.println("Success..."); 

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
