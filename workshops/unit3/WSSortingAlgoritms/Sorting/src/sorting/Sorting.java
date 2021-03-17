package sorting;

public class Sorting {

    public static void main(String[] args) {
        int[]integersToSort = {9, 7, 1, 6, 2, 3};
        System.out.print("Unsorted integers: ");
        printArray(integersToSort);
        System.out.println();
        sortBybubbleSort(integersToSort);
        System.out.print("Sorted integers: ");
        printArray(integersToSort);
        int [] integersToSort2 = {8, 1, 7, 2, 5};
        System.out.println(" ");
        System.out.print("Unsorted integers: ");
        printArray(integersToSort2);
        System.out.println("");
        sortBybubbleSort(integersToSort2);
        System.out.print("Sorted integers: ");
        printArray(integersToSort2);
       
        
        
   
    }
    public static void sortBybubbleSort (int integers[]){
        int n;
        int temp;
        n = integers.length;
        for (int i = 0; i < n - 1 ;i++){
            for (int j = 0; j < n - i - 1; j++){
                if (integers[j] > integers [j + 1])
                {
                    temp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1]= temp;
                }
                System.out.print("SORTING: ");
                printArray(integers);
                System.out.println("");
            }
            
            
            
        }
        
    }
    public static void printArray (int[] integers){
        int n = integers.length;
        for (int i = 0; i < n; i++){
            System.out.print(integers[i] + ", ");
        }
        
    }
    
}
