package sortandsearch;
import ec.edu.espe.sortandsearch.Methods;
import java.util.Scanner;
public class SortAndSearch {

    public static void main(String[] args) {
        
        int i;
        int x;
        int search;
        int[] elements = new int [6];
        Scanner input = new Scanner(System.in);
        System.out.println("--Enter 6 numbers for sort--");
        for(i = 0;i < elements.length; i++){
            System.out.print("Enter the element [ " + (i+1) + " ]:");
            elements[i]=input.nextInt();   
        }
        
        System.out.println("--SORTING--");
        System.out.print("Unsorted integers: ");
        Methods.printArray(elements);
        Methods.sort(elements);
        System.out.println();
        System.out.print("Sorted integers: ");
        Methods.printArray(elements);
        System.out.println();
        System.out.println("--SEARCHING--");
        System.out.println("Enter the number to search: ");
        x = input.nextInt();
        search = Methods.search(elements, x);
        if (search == -1) {
            System.out.println("Element isn't ´present in array");
        } else {
            System.out.println("Element is present at index: " + search);
        }

       
        
    }

}
