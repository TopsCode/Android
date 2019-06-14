package PraticeProgram;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("please enter the size of array :");
		int size=sc.nextInt();
		arr=new int[size];
		for (int j = 0; j < arr.length; j++) {
			System.out.println("please enter value at " + j);
			arr[j] = sc.nextInt();
		}
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
        
        System.out.println("enter new size : ");
        int nsize=sc.nextInt();
        int temp[]=arr;
        x=new int[nsize];
	    for(int k=0;k<temp.length;k++){
	    	arr[k]=temp[k];
	    }  
	    for(int i=temp.length;i<arr.length;i++){
	    	System.out.println("enter value at "+i);
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("final array ::");
	    for(int j=0;j<arr.length;j++){
	    	System.out.println(arr[j]); 	
	    }

	}

}
