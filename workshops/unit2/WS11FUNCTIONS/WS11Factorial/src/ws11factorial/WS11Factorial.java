package ws11factorial;

import java.util.Scanner;

public class WS11Factorial {

    public static void main(String[] args) {
        System.out.println("|   FACTORIAL   |" + "\n");
       int number = 5;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);

    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
    }

}
        
