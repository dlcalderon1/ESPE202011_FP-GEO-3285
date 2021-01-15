
package ws07menus;

import java.util.Scanner;

public class WS07Menus {
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println("------Calculator------");
            System.out.println("1. --> Addition");
            System.out.println("2. --> Subtraction");
            System.out.println("3. --> Multiplication");
            System.out.println("4. --> Division");
            System.out.println("5. --> Exit");
            
            System.out.printf("Enter your menu option -->");
            option = input.nextInt();
             switch(option){ //if else sería otra opción
                 case 1:
                     int addend1;
                     int addend2;
                     int sum;
                     System.out.println("enter addend 1 -->");
                     addend1 = input.nextInt();
                     System.out.println("enter addend 2 -->");
                     addend2 = input.nextInt();
                     sum = addend1 + addend2;
                     System.out.println("the sum is -->");
                     break;
                 case 2:
                     System.out.println("The subtraction is");
                     break;
                 case 3: 
                     System.out.println("The multiplication is");
                     break;
                 case 4:
                     System.out.println("The division is");
                     break;
                 case 5:
                     System.out.println("Good bye my friend...");
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Invalid option");
                     break;
                
             }
        } while (option < 7);
        
       
        }
}
    
    

