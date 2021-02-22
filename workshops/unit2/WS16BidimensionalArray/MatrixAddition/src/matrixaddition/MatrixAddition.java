package matrixaddition;

public class MatrixAddition {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = {{7, 8, 9}, {6, 5, 4}, {3, 2, 1}};

        //  1   2   3       7   8   9       8   10  12
        //  4   5   6   +   6   5   4  =    10  10  10
        //  7   8   9       3   2   1       10  10  10
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The addition of matrix A : ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + a[i][j]);
            }

        }
        System.out.println("\n And Matrix B : ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + b[i][j]);
            }
        }
          System.out.println("\n Equals to : ");
                for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }
                

    }
}
