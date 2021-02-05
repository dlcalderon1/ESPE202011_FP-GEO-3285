package hw06embeddedstructures;

import java.util.Scanner;

public class HW06EmbeddedStructures {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int integer1;
        int integer2;
        int sum;
        int product1;
        int product2;
        int product3;
        float quotient;
        int remainder;
        int answer;
        System.out.println(
                "======================== " + "\n"
                + "| Embedded Structures   |" + "\n"
                + "======================== " + "\n"
                + "| Team 3:            |" + "\n"
                + "| Dayana Calderón    |" + "\n"
                + "| Emilia Calvache    |" + "\n"
                + "| Eduardo Cambi      |" + "\n"
                + "| Jhon Castillo      |" + "\n"
                + "======================");

        do {
            System.out.println("==============================" + "\n"
                    + "| Enter first integer number |" + "\n"
                    + "==============================");
            integer1 = input.nextInt();
            System.out.println("==============================" + "\n"
                    + "| Enter second integer number |" + "\n"
                    + "==============================");
            integer2 = input.nextInt();
            if (integer1 == 0 || integer2 == 0) {
                System.out.println("ERROR 404");
            } else if (integer1 % 2 == 0 && integer2 % 2 == 0) {
                showMultiplication(integer1, integer2);
            } else if (integer1 % 3 == 0 && integer2 % 3 == 0) {
                showAddition(integer1, integer2);
            } else if (integer1 % 7 == 0 && integer2 % 7 == 0) {
                showModulus(integer1, integer2);
            } else if (integer1 % 11 == 0 && integer2 % 11 == 0) {
                showMultiplicationTables(integer1, integer2);

            } else if (integer1 % 13 == 0 && integer2 % 13 == 0) {
                showDivision(integer1, integer2);
            } else {
                System.out.println("ERROR 404");
            }
            System.out.println("Do you want to continue: YES(1), NO (0)");
            answer = input.nextInt();
            if (answer == 0) {
                System.exit(0);
            }
        } while (integer1 != 1 || integer2 != 1);
    }

    private static void showDivision(int integer1, int integer2) {
        float quotient;
        quotient = (float) integer1 / integer2;
        System.out.println("The quotient " + integer1 + " / " + integer2
                + " is equal to --> " + quotient);
    }

    private static void showModulus(int integer1, int integer2) {
        int remainder;
        remainder = integer1 % integer2;
        System.out.println("The remainder " + integer1 + " % " + integer2
                + " is equal to --> " + remainder);
    }

    private static void showAddition(int integer1, int integer2) {
        int sum;
        sum = integer1 + integer2;
        System.out.println("The sum " + integer1 + " + " + integer2
                + " is equal to --> " + sum);
    }

    private static void showMultiplication(int integer1, int integer2) {
        int product1;
        product1 = integer1 * integer2;
        System.out.println("The product " + integer1 + " * " + integer2
                + " is equal to --> " + product1);
    }

    public static void showMultiplicationTables(int integer1, int integer2) {
        int product2;
        System.out.println("The multiplication table of: " + integer1 + "\n");
        for (int multiplier1 = 1; multiplier1 <= 12; multiplier1++) {
            product2 = integer1 * multiplier1;
            System.out.println(+integer1 + " * " + multiplier1 + " = " + product2);
        }
        int product3;
        System.out.println("\n" + "The multiplication table of: " + integer2);
        for (int multiplier2 = 1; multiplier2 <= 12; multiplier2++) {
            product3 = integer1 * multiplier2;
            System.out.println(+integer2 + " * " + multiplier2 + " = " + product3);
        }

    }
}
