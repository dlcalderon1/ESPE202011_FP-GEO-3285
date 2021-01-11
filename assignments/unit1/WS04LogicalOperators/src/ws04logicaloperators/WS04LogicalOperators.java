package ws04logicaloperators;
public class WS04LogicalOperators {
 
    public static void main(String[] args) {
        
  int x = 10;
        if (x != 100) {
            System.out.println("x is equals to 100");
        } else {
            System.out.println("x is NOT equal to 100");
        }

        boolean y = x != 100;
        System.out.println("x != 100 --> " + (y));
        System.out.println("x == 100 --> " + (x == 10));
        System.out.println("x = 50 -->   " + (x = 50));
        System.out.println("x > 50 -->  " + (x > 50));
        System.out.println("x >= 50 --> " + (x >= 50));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 100;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 50;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println("logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        
 
        System.out.println("");
        System.out.println("Dayana Calderón TRUTH TABLE");
        System.out.println("===========================");
        System.out.println("   p        q      (p ^ q)" );
        System.out.println("===========================");
        boolean p; 
        boolean q;
       
        p =  true;
        q = true;
        System.out.println(" " + p + "      " + q + "     " + (p & q));
        
        p = true;
        q = false; 
        System.out.println(" " + p + "      " + q + "    " + (p & q));
         
        p = false;
        q = true;
        System.out.println(" " + p + "     " + q + "     " + (p & q));
        
        p = false;
        q = false;
        System.out.println(" " + p + "     " + q + "    " + (p & q));
      
        System.out.println("===========================");
    }
    
    
}
