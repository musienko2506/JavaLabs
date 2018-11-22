package com.kpi.java.laba1;

import java.util.Scanner;

public class Data {
    public static double[][] fillMatrix(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (Math.random() * 100.0);
            }
        }
        return matrix;
    }

    public static int readNumber() {
        int n = -1;
        while (true)
        {
            try {
                System.out.println("Enter the SIZE of matrix: ");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                n = Integer.parseInt(line);
                if(n<1) System.out.printf("More than 0!!!");
                else break;
            }
            catch (NumberFormatException e){
                System.out.printf("Is not NUMBER!");
            }
        }
        return n;
    }
}
