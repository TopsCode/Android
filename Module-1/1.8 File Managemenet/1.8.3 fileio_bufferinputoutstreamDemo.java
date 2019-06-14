package com.fundamentals;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileio_bufferinputoutstreamDemo {

	public static void main(String[] args) {
		try
		{
			/* FileOutputStream fout=new FileOutputStream("D:\\Nivedita_Java\\testout1.txt");    
		     BufferedOutputStream bout=new BufferedOutputStream(fout);    
		     String s="Welcome to BufferedOutputStream Class.";    
		     byte b[]=s.getBytes();    
		     bout.write(b);    
		     bout.flush();    
		     bout.close();    
		     fout.close();    
		     System.out.println("success");  
		     */
			 FileInputStream fin=new FileInputStream("D:\\Nivedita_Java\\testout1.txt");    
		     BufferedInputStream bin=new BufferedInputStream(fin);    
		     int i;    
		     while((i=bin.read())!=-1){    
		      System.out.print((char)i);    
		     }    
		     bin.close();    
		     fin.close();
		    System.out.println();
		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
