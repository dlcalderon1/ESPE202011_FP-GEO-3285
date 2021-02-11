
package Taxes;

public class Main {
    public static void main(String[] args){
        taxCalculator principal = new taxCalculator();
        System.out.println("WELCOME TO TAX CALCULATOR");
        System.out.println("");
        principal.enterData();
        principal.showIncomeTax();
        System.out.println("");
        principal.enterDataIVA();
        principal.showIVA();
        System.out.println("");
        principal.enterDataForeignExchange();
        principal.showForeignExchangeTax();  
    }
    
}
