package hw05factorialnumber;

import java.util.Scanner;

public class HW05FactorialNumber {

    public static void main(String[] args) {

        System.out.println("--- Welcome to factorial calculator ---");
        Scanner scanner = new Scanner(System.in);
        int number;
        double factorial = 1;
        System.out.printf("Enter the number (0 to 15) you want to know the factorial:");
        number = scanner.nextInt();
        System.out.println("");
        if (number == 0) {
            System.out.println("The factorial of " + number + " is:  " + 1);
        } else {
            if (number < 16) {
                for (int number1 = number; number1 > 0; number1--) {
                    factorial = factorial * number1;
                }
                System.out.println("The factorial of " + number + " is:  " + factorial);

            } else {
                System.out.println("Can´t get the factorial of " + number);

            }
        }

    }

}
