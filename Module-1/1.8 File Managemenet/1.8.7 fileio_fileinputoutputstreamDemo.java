package com.fundamentals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileio_fileinputoutputstreamDemo {

	public static void main(String[] args) {
		//String s = "Welcome to Java FileIO.";
		try {
			/*FileOutputStream fout=new FileOutputStream("D:\\Nivedita_Java\\testout.txt");
			byte b[]=s.getBytes();//convert string into byte array
			fout.write(b);
			fout.close();
			*/
			FileInputStream fin = new FileInputStream("D:\\Nivedita_Java\\testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
