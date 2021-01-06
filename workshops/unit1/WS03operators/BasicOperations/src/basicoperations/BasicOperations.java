
package basicoperations;

public class BasicOperations {

 
    public static void main(String[] args) {
   
        //ADDITION:
        int sum;
        int addend1;
        int addend2;
       
        //SUBTRACTION:
        int minuend;
        int subtrahend;
        int difference;
        
        //MULTIPLICATION:
        int multiplicand;
        int multiplicator;
        int product;
              
        //DIVISION:  
        int dividend;
        int divisor;
        int quotient;
        
        //MODULUS:
        int dividend2;
        int divisor2;
        int remainder;
        
        
        //VALUE OF THE VARIABLES:
        addend1 = 5;
        addend2 = 18;
        minuend = -23;
        subtrahend = -6;
        multiplicand = 3;
        multiplicator = 11;
        dividend = 110;
        divisor = 4;
        dividend2 = 5;
        divisor2 = 2;
        
      //ADDITION:
        sum=addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2 + 
                " is equal to --> " + sum);
        
        
        //INCREMENT:
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        sum++;
        System.out.println("sum is equal to --> " + sum);
        System.out.println("adding one to sum --> " + (sum++));
        System.out.println("adding one to sum --> " + ((++sum)));
        
        //SUBTRACTION:
        difference=minuend - subtrahend;
        System.out.println("The difference of " + minuend + " - " 
                + subtrahend + " is equal to --> " + difference);
        
        //MULTIPLICATION:
        product=multiplicand * multiplicator;
        System.out.println("The product of " + multiplicand + " * " 
                + multiplicator + " is equal to --> " + product);
        
        //DIVISION:
        quotient= dividend / divisor;
        System.out.println("The quotient of " + dividend + " / " + divisor + 
                " is equal to --> " + quotient);
        
         //MODULUS: 
         remainder=dividend2 % divisor2;
        System.out.println("The remainder of " + dividend2 + " % " + divisor2 +
                " is equal to --> " + remainder);
      
    }
    
}
