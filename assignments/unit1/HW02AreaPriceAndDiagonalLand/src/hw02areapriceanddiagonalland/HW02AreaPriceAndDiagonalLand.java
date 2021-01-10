package hw02areapriceanddiagonalland;
import java.util.Scanner;
public class HW02AreaPriceAndDiagonalLand {
public static void main(String[] args) {
     
    int width;
    int length;
    short price;
    int area;
    int priceland;
    double diagonal;
    float sumsquares;
        
    price = 15;
        
        
    Scanner scanner1 = new Scanner( System.in );
    System.out.printf( "Please introduce the width of the land: " );
    width = scanner1.nextInt();
        
    Scanner scanner2 = new Scanner( System.in );
    System.out.printf( "Please introduce the length of the land: " );
    length = scanner2.nextInt();
   
    area =  width * length;
    System.out.println("The area of the land is: " + area + " m²");
         
    System.out.println("The price per square meter is: $" + price);
         
        
    priceland = area * price;
    System.out.println("The price of the land is: $" + priceland);
        
        
    sumsquares = (width * width)+ (length * length);
    diagonal = Math.sqrt(sumsquares);
    System.out.println("The diagonal of the land is " + diagonal + " m");
    
    }
    
}
