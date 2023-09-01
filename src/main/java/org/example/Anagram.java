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

    public boolean isAnagram2(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        var letters = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            letters[word1.charAt(i) - 'a']++;
            letters[word2.charAt(i) - 'a']--;
        }

        for (int letter : letters) {
            if (letter != 0) {
                return false;
            }
        }

        return true;
    }
}
