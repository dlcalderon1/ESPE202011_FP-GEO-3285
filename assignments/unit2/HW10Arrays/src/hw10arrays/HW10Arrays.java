package hw10arrays;

import java.util.Scanner;

public class HW10Arrays {

    public static void main(String[] args) {

        int[] naturalNumbers;
        String[] secondaryColours = {"Purple", "Orange", "Green"};
        float[] rationalNumbers = {4/8F, 0.75F, -0.5F, 0.333F, 0.41F, 0.1F, 0.48F, -4/6F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of natural numbers -> ");
        n = input.nextInt();

        naturalNumbers = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter the natural number " + (i + 1) + " -> ");
            naturalNumbers[i] = input.nextInt();
        }

        for (int number : naturalNumbers) {
            System.out.println("natural number --> " + number);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("natural number " + (i + 1) + " -> " + naturalNumbers[i]);
        }

        for (String chicken : secondaryColours) {
            System.out.println("secondary colour -> " + chicken);
        }

        for (int i = 0; i < rationalNumbers.length; i++) {
            System.out.println(" rational number " + (i + 1) + " -> " + rationalNumbers[i]);
        }
    }

}
