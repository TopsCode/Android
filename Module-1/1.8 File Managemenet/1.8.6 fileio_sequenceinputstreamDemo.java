package com.fundamentals;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class fileio_sequenceinputstreamDemo {

	public static void main(String[] args) {
		try
		{
			 FileInputStream input1=new FileInputStream("D:\\Nivedita_Java\\testout.txt");    
		     FileInputStream input2=new FileInputStream("D:\\Nivedita_Java\\testout1.txt");    
		     SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		     int j;    
		     while((j=inst.read())!=-1){    
		      System.out.print((char)j);    
		     }    
		     inst.close();    
		     input1.close();    
		     input2.close(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	}

}
