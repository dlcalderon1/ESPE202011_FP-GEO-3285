package hw03iterations;

public class HW03Iterations {

    public static void main(String[] args) {
        int d;
        d = 0;
        System.out.println("-------------------------");
        System.out.println("WHILE LOOP FROM 1 TO 9:");
        System.out.println("-------------------------");
        while (d <= 9) {
            System.out.println("     d --> " + d);
            d += 1;
        }
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("MULTIPLICATION TABLE: 9");
        System.out.println("-------------------------");
        int max = 12;
        int product;
        int table = 9;
        for (int c = 1; c <= max; c++) {
            product = table * c;
            System.out.println("     9 * " + c + " = " + product);
        }
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("POWER TABLE IN BASE: 9");
        System.out.println("-------------------------");

        int máx = 9;
        int total;
        int base = 9;
        for (int min = 0; min <= máx; min++) {
            total = (int) Math.pow(base, (min));
            System.out.println("     9 ^ " + min + " = " + total);
        }
    }

}
