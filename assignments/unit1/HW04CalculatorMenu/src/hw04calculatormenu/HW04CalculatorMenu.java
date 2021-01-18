package hw04calculatormenu;

import java.util.Scanner;

public class HW04CalculatorMenu {

    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println("------Calculator------");
            System.out.println("1. --> Hypotenuse");
            System.out.println("2. --> Triangle area");
            System.out.println("3. --> Square area");
            System.out.println("4. --> Circle area");
            System.out.println("5. --> Exit");
            
            System.out.printf("Enter your menu option --> " );
            option = scanner.nextInt();
             switch(option){
                 case 1:
                     float leg1;
                     float leg2;
                     float leg11;
                     float leg22;
                     float sum;
                     float hypotenuse;
                     System.out.printf("enter leg (a) --> ");
                     leg1 = scanner.nextInt();
                     System.out.printf("enter leg (b)  --> ");
                     leg2 = scanner.nextInt();
                     leg11 = (float) Math.pow(leg1,(2));
                     leg22 = (float) Math.pow(leg2,(2));
                     sum = leg11 + leg22;
                     hypotenuse = (float) Math.sqrt(sum) ;
                     System.out.println("The hypotenuse is --> " + hypotenuse);
                     break;
                 case 2:
                     float base;
                     float height;
                     float total;
                     System.out.printf("enter base --> ");
                     base = scanner.nextInt();
                     System.out.printf("enter height --> ");
                     height = scanner.nextInt();
                     total = (base * height)/2;
                     System.out.println("The triangle area is --> " + total);
                     break;
                 case 3:
                     float side;
                     float squareSide;
                     System.out.printf("enter side --> ");
                     side = scanner.nextInt();
                     squareSide = (float) Math.pow(side, 2);
                     System.out.println("The square area is --> " + squareSide);
                     break;
                 case 4:
                     float pi = 3.141592654F;
                     float radio;
                     float squareRadio;
                     float total2;
                     System.out.printf("enter radio --> ");
                     radio = scanner.nextInt();
                     squareRadio = (float) Math.pow(radio, 2);
                     total2 = pi * squareRadio;
                     System.out.println("The circle area is --> " +total2);
                     break;
                 case 5:
                     System.out.println("Good bye, COME BACK SOON...");
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Invalid option");
                     break;
             }
                 
        } while (option < 6);
    }
}