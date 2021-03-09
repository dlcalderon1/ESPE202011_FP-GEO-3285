package ws18inspection;

import java.util.Arrays;
import java.util.Scanner;

public class CalvacheEQ11_Inspection {

    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        sum = getSum(array, input, sum);
        System.out.print("The total sum is: " + sum);
        System.out.println();

        float[] array1 = new float[3];
        float average = 0;
        average = getAverague(array1, input, average);
        System.out.println("The average is:" + average);

        int[] numbers = {12, 23, 34, 98, 87, 65, 0};
        int num;
        System.out.print("Number to search: ");
        num = input.nextInt();
        arraysBinarySearch(numbers, num);
        
        

    }
    private static void arraysBinarySearch(int[] numbers, int userNumber) {
        for (int i=0; i<numbers.length; i++){
            if (userNumber == numbers [i]){
                System.out.println(numbers[i] + " is part of the matrix ");
                System.exit(0);
            }
            
        }
        System.out.println("Plese try again ...");
    }

    public static float getAverague(float[] array1, Scanner input, float average) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the average " + (i) + " number:");
            array1[i] = input.nextFloat();
            average = (array1[(0)] + array1[(1)]+array1[(2)])/ 3;
        }
        return average;
    }

    public static int getSum(int[] array, Scanner input, int sum) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i+1) + " number:");
            array[i] = input.nextInt();
            sum += array[i];
        }
        return sum;
    }
}
    
    
    

