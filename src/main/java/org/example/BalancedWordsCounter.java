package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BalancedWordsCounter {
    public Integer count(String input) {
        if (input.length() == 0) {
            return 0;
        }

        if (!input.matches("[a-z]+")) {
            throw new RuntimeException();
        }

        List<String> possibleBalancedWords = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            possibleBalancedWords.add(input.substring(i));

            for (int j = 0; j < i; j++) {
                String currentSubstring = input.substring(j, i + 1);

                if (areOccurrencesEqual(currentSubstring)) {
                    possibleBalancedWords.add(currentSubstring);
                }
            }
        }

        return possibleBalancedWords.size();
    }

    private boolean areOccurrencesEqual(String currentSubstring) {
        HashMap<Character, Integer> lettersOccurrences = new HashMap<>();

        for (int i = 0; i < currentSubstring.length(); i++) {
            char letter = currentSubstring.charAt(i);

            if (lettersOccurrences.containsKey(letter)) {
                lettersOccurrences.put(letter, lettersOccurrences.get(letter) + 1);
                continue;
            }

            lettersOccurrences.put(letter, 1);
        }

        int occurrences = lettersOccurrences.get(currentSubstring.charAt(0));

        for (Character letter : lettersOccurrences.keySet()) {
            if (lettersOccurrences.get(letter) != occurrences) {
                return false;
            }
        }

        return true;
    }
}
