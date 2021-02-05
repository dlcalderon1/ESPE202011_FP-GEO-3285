package ws10functions;

public class WS10Functions {

    public static void main(String[] args) {
         System.out.println("======================== " + "\n"
                    + "| FUNCTIONS   |" + "\n"
                    + "======================== " + "\n"
                    + "| Dayana Calderón    |" + "\n" 
                    + "======================");

       int dividend = 20;
        int divisor = 4;
        float quotient = 0;
        int x = 0;
        int y = 0;
        
        quotient = divideTwoNumbers(dividend, divisor);

        System.out.println("Quotient of 5 and 10 is : " + quotient); 

        y = f(6);
        System.out.println("6² -> " + y);

        y = f(-6);
        System.out.println("(-6)² -> " + y); 
        
        x = 100;
        y = f(x);
        System.out.println("the square of  " + x + "  is equal to : " + y);

    }

    
    public static float divideTwoNumbers(int dividend, int divisor) {
        
        float quotient = 0.0F;

      
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

}