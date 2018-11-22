package com.kpi.java.laba1;

import static com.kpi.java.laba1.Data.*;


public class Matrix {
    public static void main(String[] args)
    {
        System.out.println("Musienko V.S.");
        int n = readNumber();
        double[][] startMatrix = fillMatrix(n);
        System.out.println("Start matrix: ");
        printMatrix(startMatrix);

        System.out.println("Turned matrix: ");
        rotateMatrixInplace(startMatrix);
        printMatrix(startMatrix);
    }
    public static double[][] turnMatrix(double[][] startMatrix)
    {
        int n = startMatrix.length;
        double[][] turnedMatrix = new double[n][n];
        for (int i = 0; i <=n-1 ; i++) {
            for (int j = 0; j <=n-1; j++) {
                turnedMatrix[j][n-1-i]=startMatrix[i][j];
            }
        }
        return turnedMatrix;
    }
    public static void rotateMatrixInplace(double[][] matrix) {
        int length = matrix.length-1;

        for (int i = 0; i <= (length)/2; i++) {
            for (int j = i; j < length-i; j++) {

                double p1 = matrix[i][j];

                double p2 = matrix[j][length-i];

                double p3 = matrix[length-i][length-j];

                double p4 = matrix[length-j][i];

                matrix[j][length-i] = p1;
                matrix[length-i][length-j] = p2;
                matrix[length-j][i] = p3;
                matrix[i][j] = p4;
            }
        }
    }

    public static void printMatrix(double[][] matrix){
        for (double[]  row : matrix) {
            for (double elem : row) {
                System.out.printf("%14.2f", elem);
            }
            System.out.println();
        }
    }
}
