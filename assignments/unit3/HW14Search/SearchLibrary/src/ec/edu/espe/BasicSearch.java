package ec.edu.espe;

public class BasicSearch {

    public static int search(int elements[], int x) {
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            if (elements[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int elements[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (elements[mid] == x) {
                return mid;
            }
            if (elements[mid] > x) {
                return binarySearch(elements, left, mid - 1, x);
            }
            return binarySearch(elements, mid + 1, right, x);
        }
        return -1;
    }

}
