package modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

public class ModularCalculator {

    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;
        Scanner data = new Scanner(System.in);
        System.out.println("--ADDITION--");
        System.out.println("Enter the addend 1: ");
        operand1 = data.nextFloat();
        System.out.println("Enter the addend 2: ");
        operand2 = data.nextFloat();
        result = BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " + " + operand2+ " = " + result);
        
        System.out.println("--SUBTRACTION--");
        result = BasicOperation.substractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " - " + operand2+ " = " + result);
        
        System.out.println("--MULTIPLICATION--");
        result = BasicOperation.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2+ " = " + result);
        
        System.out.println("--DIVISION--");
        result = BasicOperation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " / " + operand2+ " = " + result);
    }
    
}
