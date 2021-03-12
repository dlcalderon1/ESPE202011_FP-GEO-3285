package ws20refrigerators;

import java.util.Scanner;

public class WS20Refrigerators {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        float transparencyCoef;
        float massMet;
        float QcH2O;
        float QsH2O;
        System.out.println("AUTHOR: CALDERÓN DAYANA");
        System.out.println("--FOR CALCULATE TRANSPARENT COEFFICIENT--");
        System.out.print("Enter the Qc's wather (kJ): ");
        QcH2O = data.nextFloat();
        System.out.print("Enter the Qs' wather (kJ): ");
        QsH2O = data.nextFloat();
        transparencyCoef = calculateTransparentCoefficient(QcH2O,QsH2O);
        System.out.println("The transparent coefficient is: " + transparencyCoef + "kJ");
        System.out.println("--METANOL MASS USED TO OBTAIN ICE--");
        massMet = calculateMetanolMass(transparencyCoef);
        System.out.println("The metanol mass is : " + massMet + " kg");

    }
    

    private static float calculateTransparentCoefficient(float QcH2O, float QsH2O) {
        float transparentCoef;
        transparentCoef = QcH2O + QsH2O;
        return transparentCoef;
    }
    private static float calculateMetanolMass(float transparencyCoef) {
        float evaporationMet = 1180;
        float massMet;
        massMet = transparencyCoef / evaporationMet;
        return massMet;
    }
    
}
