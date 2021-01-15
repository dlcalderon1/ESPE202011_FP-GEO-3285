
package ws07menus;

import java.util.Scanner;

public class WS07Menus {
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println("------Calculator------");
            System.out.println("1. --> Division");
            System.out.println("2. --> Modulus");
            System.out.println("3. --> Square root ");
            System.out.println("4. --> Power");
            System.out.println("5. --> Exit");
            
            System.out.printf("Enter your menu option --> " );
            option = input.nextInt();
             switch(option){ //if else sería otra opción
                 case 1:
                     int dividend;
                     int divisor;
                     int quotient;
                     System.out.printf("enter dividend --> ");
                     dividend = input.nextInt();
                     System.out.printf("enter divisor --> ");
                     divisor = input.nextInt();
                     quotient = dividend / divisor;
                     System.out.println("the division is --> " + quotient);
                     break;
                 case 2:
                     System.out.println("The modulus is");
                     break;
                 case 3: 
                     System.out.println("The  square root");
                     break;
                 case 4:
                     System.out.println("The power is");
                     break;
                 case 5:
                     System.out.println("Good bye friend...");
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Invalid option");
                     break;
             }
        } while (option < 6);
        
       
        }
}
    
    

