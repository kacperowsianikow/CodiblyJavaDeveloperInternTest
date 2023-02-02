package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {
    private static final BalancedWordsCounter BALANCED_WORDS_COUNTER = new BalancedWordsCounter();

    @Test
    void count_onlyLetters() {
        String input = "aabbabcccba";
        Integer result = 28;

        assertEquals(result, BALANCED_WORDS_COUNTER.count(input));
    }

    @Test
    void count_emptyInput() {
        String input = "";
        Integer result = 0;

        assertEquals(result, BALANCED_WORDS_COUNTER.count(input));
    }

    @Test
    void count_lettersWithInteger() {
        String input = "abababa1";

        assertThrows(RuntimeException.class, () -> BALANCED_WORDS_COUNTER.count(input));
    }

    @Test
    void count_nullInput() {
        assertThrows(RuntimeException.class, () -> BALANCED_WORDS_COUNTER.count(null));
    }
}