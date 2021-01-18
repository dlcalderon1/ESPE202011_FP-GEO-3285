package calderóndayanaq11;
import java.util.Scanner;
public class CalderónDayanaQ11 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner (System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println("------MULTIPLICATION TABLE------");
            System.out.println("1. ---> TABLES");
            System.out.println("2. ---> Exit");
            
            System.out.printf("Enter your menu option --> " );
            option = scanner.nextInt();
             switch(option){
                 case 1: 
                     int num;
                     System.out.printf("Enter the table that you want to study --> ");
                     num = scanner.nextInt();
                     int máx=12;
                     int product;
                     for (int min= 1; min <= máx; min++){
                     product = num * min;
                         System.out.println("  " + num + " * " + min + " = " + product);
                         
                     }
                     break;
                 case 2:
                     System.out.println("Good bye, COME BACK SOON...");
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Invalid option");
                     break;
                 }
                 
        } while (option < 3);
    }
}   
        
  