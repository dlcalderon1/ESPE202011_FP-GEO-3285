
package ec.edu.espe.tax;

public class BasicTax {
    
    public static float computeIva(float basePrice, float percentageValue){
        float iva;
        iva = basePrice * percentageValue / 100;
        return iva;
    }
    
}
