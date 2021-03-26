package ec.edu.espe.sorting.controller;

import java.util.Arrays;

public class Search {

    public static int SearchString(String[] courses, String searchElement) {
        for (int x = 0; x < courses.length; x++) {
            if (courses[x].equals(searchElement)) {
                return x;
            }
        }
        return -1;
    }
}
