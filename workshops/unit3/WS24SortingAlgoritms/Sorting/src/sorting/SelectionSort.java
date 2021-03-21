package sorting;

public class SelectionSort {

    public int[] sort(int[] unsortedArray) {
        int size = unsortedArray.length;
        int minumum;
        int pos;

        for (int i = 0; i < size - 1; i++) {
            minumum = unsortedArray[i];
            pos = i;
            for (int j = i + 1; j < size; j++) {
                if (unsortedArray[j] < minumum) {
                    minumum = unsortedArray[j];
                    pos = j;
                }
            }
            unsortedArray[pos] = unsortedArray[i];
            unsortedArray[i] = minumum;
            System.out.println("");
            printMatrix(unsortedArray);
        }
        
        return unsortedArray;
        
    }

    public void printMatrix(int[] unsortedArray) {
        for (int element : unsortedArray) {
            System.out.print(element + ", ");
        }
        System.out.println("");
    }

//    public int[] sort2(int[] unsortedArray) {
//        int size = unsortedArray.length;
//        int minumumIndex;
//        int pos;
//
//        for (int i = 0; i < size - 1; i++) {
//            minumumIndex = i;
//            for (int j = i + 1; j < size; j++) {
//                if (unsortedArray[j] < unsortedArray[minumumIndex]) {
//                    minumumIndex = j;
//                }
//            }
//            pos = unsortedArray[minumumIndex];
//            unsortedArray[minumumIndex] = unsortedArray[i];
//            unsortedArray[i] = pos;
//
//            printMatrix(unsortedArray);
//        }
//
//        return unsortedArray;
//    }
}
