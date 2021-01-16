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
            System.out.println("4. --> Exponent");
            System.out.println("5. --> Exit");
            
            System.out.printf("Enter your menu option --> " );
            option = input.nextInt();
             switch(option){ //if else sería otra opción
                 case 1:
                     float dividend;
                     float divisor;
                     double quotient;
                     System.out.printf("enter dividend --> ");
                     dividend = input.nextInt();
                     System.out.printf("enter divisor --> ");
                     divisor = input.nextInt();
                     quotient = dividend / divisor;
                     System.out.println("the division is --> " + quotient);
                     break;
                 case 2:
                     int dividend2;
                     int divisor2;
                     int remainder;
                     System.out.printf("enter dividend --> ");
                     dividend2 = input.nextInt();
                     System.out.printf("enter divisor --> ");
                     divisor2 = input.nextInt();
                     remainder = dividend2 % divisor2;
                     System.out.println("The modulus is --> " + remainder);
                     break;
                 case 3: 
                     int radicand;
                     double squareRoot;
                     System.out.printf("enter radicand --> ");
                     radicand = input.nextInt();
                     squareRoot = (float) Math.sqrt(radicand);
                     System.out.println("The  square root is --> " + squareRoot);
                     break;
                 case 4:
                     int base;
                     int exponent;
                     int result; 
                     System.out.printf("enter base --> ");
                     base = input.nextInt();
                     System.out.printf("enter exponent --> ");
                     exponent = input.nextInt();
                     result = (int) Math.pow(base,(exponent));
                     System.out.println("The exponent is --> " + result);
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
    
    

