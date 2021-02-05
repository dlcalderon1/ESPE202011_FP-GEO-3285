package hw07functions;

import java.util.Scanner;

public class HW07Functions {

    public static void main(String[] args) {
        System.out.println("======================== " + "\n"
                + "|   FUNCTIONS   |" + "\n"
                + "======================== " + "\n"
                + "| Dayana Calderón |" + "\n"
                + "======================" +  "\n");

        Scanner keyboard = new Scanner(System.in);
        //DIVISION
        System.out.println("|   DIVISION BETWEEN 2 NUMBERS   |" + "\n");
        System.out.printf("Enter dividend number: ");
        int dividend = keyboard.nextInt();
        System.out.printf("Enter divisor number: ");
        int divisor = keyboard.nextInt();
        float quotient = fractionIntegerNumbers(dividend, divisor);
        System.out.println("The quotient of " + dividend + "/" + divisor
                + " is : " + quotient + "\n");

        //SQUARE
        System.out.println("|   SQUARE OF A NUMBER   |" + "\n");
        System.out.printf("Enter number: ");
        int base = keyboard.nextInt();
        int solution = squareANumber(base);
        System.out.println("The square of " + base + " is : " + solution + "\n");

        //POLYNOMIAL
        System.out.println("|   PILONOMYAL (X²+X+1)   |" + "\n");
        System.out.printf("Enter x: ");
        int indVariable = keyboard.nextInt();
        int result = solvePolynomial(indVariable);
        System.out.println(indVariable + "² + 2 * " + indVariable + " + 1 = "
                + result + "\n");

        //MULTIPLICATION TABLE
        System.out.println("|   MULTIPLICATION TABLE   |"+ "\n");
        System.out.printf("Enter a number to know the multiplication table: ");
        int number = keyboard.nextInt();
        int stop = 12;

        for (int multiplier = 1; multiplier <= stop; multiplier++) {
            int product = multiplicationTable(number, multiplier);
            System.out.println(+number + " * " + multiplier + " = " + product + "\n");

        }
        System.out.println("COME BACK SOON...");
        

    }

    public static float fractionIntegerNumbers(int dividend, int divisor) {
        float quotient = 0.00F;
        quotient = (float) dividend / (float) divisor;
        return quotient;
    }

    public static int squareANumber(int base) {
        int solution;
        solution = base * base;
        return solution;
    }

    public static int solvePolynomial(int indVariable) {
        int result;
        result = indVariable * indVariable + 2 * indVariable + 1;
        return result;
    }

    public static int multiplicationTable(int number, int multiplier) {
        int product;
        product = number * 1;

        return product;
    }
    }



