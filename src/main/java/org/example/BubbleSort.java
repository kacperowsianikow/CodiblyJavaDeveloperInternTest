package org.example;

import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public List<Comparable<?>> sort(List<Comparable<?>> input) {
        if (input == null) {
            throw new RuntimeException();
        }

        while (input.contains(null)) {
            input.remove(null);
        }

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < input.size() - 1; i++) {
                String first = String.valueOf(input.get(i));
                String second = String.valueOf(input.get(i + 1));

                if (first.compareTo(second) > 0) {
                    swapped = true;

                    Collections.swap(input, i, i + 1);
                }
            }
        }

        return input;
    }
}
