package ws11factorial;

import java.util.Scanner;

public class WS11Factorial {

    public static void main(String[] args) {
        System.out.println("|   FACTORIAL   |" + "\n");
        System.out.printf("Enter a number to know the factorial: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int factorial = 0;
        factorial = factorial (number);
        System.out.println("The factorial of " + number + " is : " + factorial);

    }

    public static int factorial(int number) {
        if (number < 0) {
            return -1;
        } else {
            if (number == 0) {
                return 1;
            }
            return (number * factorial(number - 1));
        }
    }
}
        
