package hw11matrixoperation;

import java.util.Scanner;

public class HW11MatrixOperation {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int[][] matrixT = null;
        int[][] matrixA = null;
        int rowsA;
        int columnsA;
        System.out.println("MATRIX A: ");
        System.out.print("Enter the number of rows: ");
        rowsA = data.nextInt();
        System.out.print("Enter the number of columns: ");
        columnsA = data.nextInt();
        if (rowsA <= 4 && columnsA <= 4) {
            matrixA = new int[rowsA][columnsA];
        } else {
            System.out.print("The number of rows or columns must be less than 4");
            System.exit(0);
        }
        System.out.println("Enter your matrix A: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.print("a [ " + (i + 1) + " ] [ " + (j + 1) + " ] : ");
                matrixA[i][j] = data.nextInt();

            }

        }
        System.out.println("\n Your first matrix: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.print("\t " + matrixA[i][j]);

            }
            System.out.println("");
        }
        int rowsB;
        int columnsB;

        System.out.println("MATRIX B: ");
        int[][] matrixB = null;
        System.out.print("Enter the number of rows: ");
        rowsB = data.nextInt();
        System.out.print("Enter the number of columns: ");
        columnsB = data.nextInt();
        if (rowsB <= 4 && columnsB <= 4) {
            matrixB = new int[rowsB][columnsB];
        } else {
            System.out.print("The number of rows or columns must be less than 4");
        }
        System.out.println("");
        System.out.println("Enter your matrix B: ");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print("b [ " + (i + 1) + " ] [ " + (j + 1) + " ] : ");
                matrixB[i][j] = data.nextInt();
            }
        }
        System.out.println("\n Your second matrix: ");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print("\t " + matrixB[i][j]);
            }
            System.out.println("");
        }
        if (columnsA == rowsB) {
            matrixT = new int[rowsA][columnsB];
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < columnsB; j++) {
                    for (int k = 0; k < columnsA; k++) {
                        matrixT[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

        } else {
            System.out.println("Matrices can not be multiplied");
        }
        System.out.println("A * B: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print("\t " + matrixT[i][j]);

            }
            System.out.println("");
        }

    }
}
