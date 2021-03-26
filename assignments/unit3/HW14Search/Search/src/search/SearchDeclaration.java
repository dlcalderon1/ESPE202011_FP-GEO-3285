package search;

import ec.edu.espe.BasicSearch;
import java.util.Scanner;
public class SearchDeclaration {

    public static void main(String[] args) {
        System.out.println("Author: Calderón Dayana");
        Scanner input = new Scanner(System.in);
        int[] ages = {1, 14, 16, 21, 23, 31, 35, 40, 41, 58, 65, 99};
        int x;
        int search;
        int mid;
        //Lineal search
        System.out.println("Enter the age to search: ");
        x = input.nextInt();
        search = BasicSearch.search(ages, x);
        if (search == -1) {
            System.out.println("Element isn't ´present in array");
        } else {
            System.out.println("Element is present at index: " + search);
        }
        // Binary search
        mid = ages.length;
        System.out.println("Enter the age to search: ");
        x = input.nextInt();
        search = BasicSearch.binarySearch(ages, 0, mid - 1, x);
        if (search == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + search);
        }

    }

}
