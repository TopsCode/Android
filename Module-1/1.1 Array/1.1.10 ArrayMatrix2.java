package core;

import java.util.Scanner;

public class ArrayMatrix2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Arr = new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;

        //Matrix Input
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Arr[row][col] = input.nextInt();
            }
        }

        //diagonal, upper, lower
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumOfDiagonalElements = sumOfDiagonalElements + Arr[row][col];
                }

                if (row < col) {
                    sumOfUpperElements = sumOfUpperElements + Arr[row][col];
                }

                if (row > col) {
                    sumOfLowerElements = sumOfLowerElements + Arr[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal elements: " + sumOfDiagonalElements);
        System.out.println("Sum of upper elements: " + sumOfUpperElements);
        System.out.println("Sum of lower elements: " + sumOfLowerElements);
    }

}
