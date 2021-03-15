package matrixdeclaration;

import ec.edu.espe.matrix.BasicMatrix;
import java.util.Scanner;

public class MatrixDeclaration {

    public static void main(String[] args) {
        System.out.println("-- Dayana Calderón Matrix --");
        int[][] a;
        int[][] b;
        int[][] t;
        int[][] c;
        int m = 0;
        int n = 0;

        Scanner data = new Scanner(System.in);

        System.out.println(" ENTER THE MATRIX DIMENSIONS ");
        System.out.print("\n m (crows)->");
        m = data.nextInt();

        System.out.print("\n n (columns)->");
        n = data.nextInt();

       
        b = new int[m][n];
        c = new int[m][n];
        t = new int[n][m];

        System.out.println("------ MATRIX ELEMENTS -------");

        a = BasicMatrix.readMatrixElements(m, n, "A", data);
        b = BasicMatrix.readMatrixElements(m, n, "B", data);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("A:");

        BasicMatrix.prettyPrintMatrix(m, n, a);
        System.out.println("");

        System.out.println("B:");
        BasicMatrix.prettyPrintMatrix(m, n, b);

        BasicMatrix.transpose(n, m, t, a);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("-- TRANSPOSE --");
        BasicMatrix.prettyPrintMatrix(m, n, t);

        System.out.println("-- THE ADDITION OF A + B --");

        c = BasicMatrix.addTwoMatrices(m, n, a, b);
        BasicMatrix.prettyPrintMatrix(m, n, c);

        System.out.println("-- THE SUBTRACTION OF A - B --");

        c = BasicMatrix.substractTwoMatrices(m, n, a, b);
        BasicMatrix.prettyPrintMatrix(m, n, c);

    }

}
