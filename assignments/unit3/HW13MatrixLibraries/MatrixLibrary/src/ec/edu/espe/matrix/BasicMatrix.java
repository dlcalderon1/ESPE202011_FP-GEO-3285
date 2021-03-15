package ec.edu.espe.matrix;

import java.util.Scanner;

public class BasicMatrix {

    public static int[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        int[][] matrix;
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("-- ROWS " + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void transpose(int n, int m, int[][] t, int[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];
            }
        }
    }

    public static int[][] addTwoMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] c;
        c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static int[][] substractTwoMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] c;
        c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrintMatrix(int m, int n, int[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌ \t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");

                    } else {
                        System.out.print("│\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print(" \t┐");
                    } else if (i == m - 1) {
                        System.out.print(" \t┘");

                    } else {
                        System.out.print("  \t│");
                    }
                }
            }
        }
        System.out.println("");
    }

}
