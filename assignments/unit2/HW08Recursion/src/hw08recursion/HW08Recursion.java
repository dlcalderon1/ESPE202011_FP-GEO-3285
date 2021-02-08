package hw08recursion;
import java.util.Scanner;
public class HW08Recursion {

    public static void main(String[] args) {
        
   System.out.println("|   FIBONACCI  |" + "\n");
        System.out.printf("Enter the digit of the Fibonacci series you want to know: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int fibonacci;
        fibonacci = calculateFibonacci(number);
        System.out.println("The " + number + " digit of fibonacci is: " + fibonacci);

    }

    public static int calculateFibonacci(int number) {
        if (number <= 1) {
            return number;
        }else if (number > 39){
            System.out.println("The number is so complex to calculate");
            
            return 0;
        }
        else { return calculateFibonacci(number - 1) + calculateFibonacci(number - 2);
        }
            
    }
}
    
