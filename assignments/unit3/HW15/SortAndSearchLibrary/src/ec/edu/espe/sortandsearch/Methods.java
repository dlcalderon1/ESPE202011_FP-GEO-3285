package ec.edu.espe.sortandsearch;

public class Methods {

    public static void sort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            int aux = unsortedArray[i];
            int pos = i;
            while (pos > 0 && unsortedArray[pos - 1] > aux) {
                unsortedArray[pos] = unsortedArray[pos-1];
                pos--;
            }
            unsortedArray[pos]=aux;
        }
    }

    

    public static int search(int elements[], int x) {
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            if (elements[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(int[] integers) {
        int n = integers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(integers[i] + ", ");
        }

    }

}
