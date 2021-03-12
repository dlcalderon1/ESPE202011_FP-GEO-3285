package taxdeclarations;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;

public class TaxDeclaration {

    public static void main(String[] args) {
        float price;
        float totalPrice;
        float ivaValue;
        final float ivaPercentage= 12;
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("-- Dayana Calderón Taxes --");
        System.out.println("IVA : ");
        System.out.println("Enter the price of your products: ");
        price = data.nextFloat();
        ivaValue = BasicTax.computeIva(price, ivaPercentage);
        totalPrice = price + ivaValue;
        System.out.println("Total price: " +totalPrice);
        
        
      
    }
    
}
