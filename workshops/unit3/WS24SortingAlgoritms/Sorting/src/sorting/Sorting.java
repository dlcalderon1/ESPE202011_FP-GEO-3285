package sorting;

public class Sorting {

    public static void main(String[] args) {
        
        int[]integersToSort = {9, 7, 1, 6, 2, 3};
        System.out.print("Unsorted integers: ");
        printArray(integersToSort);
        System.out.println();
        BubbleSort.sort(integersToSort);
        System.out.print("Sorted integers: ");
        printArray(integersToSort);
        
        int [] integersToSort2 = {8, 1, 7, 2, 5};
        System.out.println(" ");
        System.out.print("Unsorted integers: ");
        printArray(integersToSort2);
        System.out.println("");
        BubbleSort.sort(integersToSort2);
        System.out.print("Sorted integers: ");
        printArray(integersToSort2);
        
        SelectionSort selectionSort = new SelectionSort();
        integersToSort2 = new int[]{42, 30, -5, 7, 1, 50};
        System.out.println("");
        System.out.println("Sorting integers by SELECTION SORT");
        System.out.println("");
        printArray(integersToSort2);
        int[] sortedArray = selectionSort.sort(integersToSort2);
        System.out.println("");
        printArray(sortedArray);
        
        
    }
    public static void printArray (int[] integers){
        int n = integers.length;
        for (int i = 0; i < n; i++){
            System.out.print(integers[i] + ", ");
        }
        
    }
    
}
