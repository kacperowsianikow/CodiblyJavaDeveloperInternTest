package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private static final BubbleSort BUBBLE_SORT = new BubbleSort();

    @Test
    void sort_onlyIntegers() {
        List<Comparable<?>> input = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 8, 3, 8));
        List<Comparable<?>> result = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 8, 8));

        assertEquals(result, BUBBLE_SORT.sort(input));
    }

    @Test
    void sort_doublesAndIntegers() {
        List<Comparable<?>> input = new ArrayList<>(Arrays.asList(-9.3, 0.2, 4, 0.1, 5, 9));
        List<Comparable<?>> result = new ArrayList<>(Arrays.asList(-9.3, 0.1, 0.2, 4, 5, 9));

        assertEquals(result, BUBBLE_SORT.sort(input));
    }

    @Test
    void sort_emptyInput() {
        List<Comparable<?>> input = new ArrayList<>();
        List<Comparable<?>> result = new ArrayList<>();

        assertEquals(result, BUBBLE_SORT.sort(input));
    }

    @Test
    void sort_inputWithNullAndDouble() {
        List<Comparable<?>> input = new ArrayList<>(Arrays.asList(null, 5.0001));
        List<Comparable<?>> result = new ArrayList<>(List.of(5.0001));

        assertEquals(result, BUBBLE_SORT.sort(input));
    }

    @Test
    void sort_nullInput() {
        assertThrows(RuntimeException.class, () -> BUBBLE_SORT.sort(null));
    }
}