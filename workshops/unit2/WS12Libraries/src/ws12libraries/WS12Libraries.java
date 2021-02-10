package ws12libraries;

public class WS12Libraries {

    public static void main(String[] args) {
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float absoluteValue = 0.0F;
//Square Root
        number = 99;
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square of " + number + " is " + squareRoot);

        number = 100;
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square of " + number + " is " + squareRoot);

        number = 50;
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square of " + number + " is " + squareRoot);
//Power
        base = 33;
        exponent = 2;
        /*power = (float)Math.pow(base, exponent);
        System.out.println(base + " ^ "  + exponent + " = "+ power);*/
        power = showThePower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + power);

        base = 22;
        exponent = 4;
        power = (float) Math.pow(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + power);

        base = 78;
        exponent = 5;
        power = (float) Math.pow(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + power);

        //Absolute Value
        number = -5;
        absoluteValue = getAbsoluteValue(number);
        System.out.println("The absolute value of " + number + " is: " +absoluteValue);
        
        number = 5;
        absoluteValue = getAbsoluteValue(number);
        System.out.println("The absolute value of " + number + " is: " +absoluteValue);
       
        

    }

    public static float showThePower(float base, float exponent) {
        float power;
        power = 1.0F;
        for (int number = 1; number <= (int) exponent; number++) {
            power = power * base;

        }
        return power;
    }

    private static float getAbsoluteValue(float number) {
        if ( number < 0 ){
            return -number;
        }
        else {
            return number;
        }
//        if (number < 0) {
//            number = number * -1;
//            return number;
//        }
//        return number;
    }

}
