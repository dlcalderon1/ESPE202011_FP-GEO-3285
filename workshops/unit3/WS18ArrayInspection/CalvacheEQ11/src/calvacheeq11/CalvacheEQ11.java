/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calvacheeq11;

import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import java.util.Scanner;

/**
 *
 * @author Emilia
 */
public class CalvacheEQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        sum = getSum(array, input, sum);
        System.out.print("The total sum is: " + sum);

        float[] array1 = new float[3];
        float average = 0;
        average = getAverague(array1, input, average);
        System.out.println("The average is:" + average);

        int[] numbers = {12, 23, 34, 98, 87, 65, 0};
        int result = Arrays.binarySearch(array, 400); //Arrays.binarySearch??? where
        System.out.println(String.format("Result %d", result));
        return false;

    }

    public static float getAverague(float[] array1, Scanner input, float average) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the average " + i + " number:");
            array1[i] = input.nextInt(); //input.nextFloat;
            average = (float) array1[i] / 3;
        }
        return average;
    }

    public static int getSum(int[] array, Scanner input, int sum) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + i + " number:");
            array[i] = input.nextInt();
            sum += array[i];
        }
        return sum;
    }
}
