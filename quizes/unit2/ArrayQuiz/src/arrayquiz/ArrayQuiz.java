package arrayquiz;

import java.util.Scanner;

public class ArrayQuiz {

    public static void main(String[] args) {

        String[] candidatesNames = new String[16];
        double[] percentage = new double[16];

        candidatesNames[0] = "Andrés Arauz";
        candidatesNames[1] = "Guillermo Lasso";
        candidatesNames[2] = "Yaku Pérez";
        candidatesNames[3] = "Xavier Hervas";
        candidatesNames[4] = "Pedro Freire";
        candidatesNames[5] = "Isidro Romero";
        candidatesNames[6] = "Lucio Gutiérrez";
        candidatesNames[7] = "Gerson Almeida";
        candidatesNames[8] = "Ximena Peña";
        candidatesNames[9] = "Guillermo Celi";
        candidatesNames[10] = "Juan Fernando Velazco";
        candidatesNames[11] = "César Montúfar";
        candidatesNames[12] = "Gustavo Larrea";
        candidatesNames[13] = "Carlos Sagnay";
        candidatesNames[14] = "Giovanny Andrade";
        candidatesNames[15] = "Paúl Carrasco";

        percentage[0] = 32.72;
        percentage[1] = 19.74;
        percentage[2] = 19.39;
        percentage[3] = 15.68;
        percentage[4] = 2.08;
        percentage[5] = 1.86;
        percentage[6] = 1.78;
        percentage[7] = 1.73;
        percentage[8] = 1.54;
        percentage[9] = 0.91;
        percentage[10] = 0.82;
        percentage[11] = 0.62;
        percentage[12] = 0.4;
        percentage[13] = 0.29;
        percentage[14] = 0.22;
        percentage[15] = 0.21;
        

        for (String names : candidatesNames) {
            System.out.println("The candidate -> " + names);
        }

        for (int i = 0; i < percentage.length; i++) {
            System.out.println("The candidate " + (i + 1) + " -> " + percentage[i] + " %");
        }

    }
}
