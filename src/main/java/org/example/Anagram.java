package org.example;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String word1, String word2) {
        var firstWordLetters = countLetters(word1);
        var secondWordLetters = countLetters(word2);
        return firstWordLetters.equals(secondWordLetters);
    }

    private Map<Character, Integer> countLetters(String word) {
        var letters = new HashMap<Character, Integer>();
        for (int i = 0; i < word.length(); i++) {
            letters.merge(word.charAt(i), 1, Integer::sum);
        }
        return letters;
    }
}
