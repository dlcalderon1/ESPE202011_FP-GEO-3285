package evenoroddnumbers;

import java.util.Scanner;


public class EvenOrOddNumbers {

    
    public static void main(String[] args) {
    
        int number;
        Scanner scanner = new Scanner( System.in );

        System.out.printf( "Please introduce a integer number: " );
        number = scanner.nextInt();
        
        if ( number % 2 == 0 )
        {
            System.out.printf( "The number " +number+ " Is Even " );
        }
        else
        {
            System.out.printf( "The number " +number+ " Is Odd " );
        }      
         
    }
   }
 