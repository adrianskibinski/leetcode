package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        var anagrams = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            var key = sortStringLetters(strs[i]);
            if (anagrams.containsKey(key)) {
                anagrams.get(key).add(strs[i]);
            } else {
                anagrams.put(key, new ArrayList<>());
                anagrams.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(anagrams.values());
    }

    private String sortStringLetters(String word) {
            var str = word.toCharArray();
            Arrays.sort(str);
            return new String(str);
    }
}
