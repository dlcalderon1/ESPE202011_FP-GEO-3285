package hw12matrixfunctions;

import java.util.Scanner;

public class HW12MatrixFunctions {

    public static void main(String[] args) {
        
        int[][] matrixT = null;
        int[][] matrixA = null;
        Scanner data = new Scanner(System.in);
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
        readElementsMatrix('a', rowsA, columnsA, matrixA, data);
        System.out.println("\n Your first matrix: ");
        printMatrix(rowsA, columnsA, matrixA);
        int[][] matrixB = null;
        int rowsB;
        int columnsB;

        System.out.println("MATRIX B: ");
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
        readElementsMatrix('b', rowsB, columnsB, matrixB, data);
        System.out.println("\n Your second matrix: ");
        printMatrix(rowsB, columnsB, matrixB);
        
        //Multiplication:
        matrixT = multiplyMatrix(columnsA, rowsB, matrixT, rowsA, columnsB, matrixA, matrixB);

        System.out.println("A * B: ");
        printMatrix(rowsA, columnsB, matrixT);

    }

    private static int[][] multiplyMatrix(int columnsA, int rowsB, int[][] matrixT, 
            int rowsA, int columnsB, int[][] matrixA, int[][] matrixB) {
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
        return matrixT;
    }

    private static void printMatrix(int rows, int columns, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("\t " + matrix[i][j]);

            }
            System.out.println("");
        }
    }

    private static void readElementsMatrix(char name, int rowsA, int columnsA, 
            int[][] matrixA, Scanner data) {
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.print(name + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] : ");
                matrixA[i][j] = data.nextInt();

            }

        }
    }
}
