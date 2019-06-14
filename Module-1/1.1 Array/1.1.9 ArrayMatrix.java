package core;

import java.util.Scanner;

public class ArrayMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] Arr1 = new int[2][3];
        int [][] Arr2 = new int[2][3];
        int [][] Arr3 = new int[2][3];
        
        System.out.println("Enter elements for A matrix: ");
        //getting input for A matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Arr1[%d][%d]= ", row, col);
                Arr1[row][col]=input.nextInt();
            }
        }
        
        System.out.println("Enter elements for B matrix: ");
        //getting input for B matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Arr2[%d][%d]= ", row, col);
                Arr2[row][col]=input.nextInt();
            }
        }
        
        System.out.println("\n");
        //printing A matrix
        System.out.println("Arr1= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + Arr1[row][col]);
            }
            System.out.println();
        }
        
        System.out.println("\n");
        //printing B matrix
        System.out.println("Arr2= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + Arr2[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n");
        //adding A and B Matrix
        System.out.println("Arr1 + Arr2= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                Arr3[row][col] = Arr1[row][col] + Arr2[row][col];
                System.out.print("\t " + (Arr3[row][col]));
            }
            System.out.println();
        }
    }
    
}
