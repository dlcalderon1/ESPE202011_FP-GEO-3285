package ec.edu.espe.sorting.controller;

public class Searcher {

    public int findInteger(int[] elements, int x) {
        int i;
        int n = elements.length;
        for (i = 0; i < n; i++) {

            if (elements[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
