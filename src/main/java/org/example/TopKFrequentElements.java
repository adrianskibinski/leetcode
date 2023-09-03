package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        var counter = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (counter.containsKey(num)) {
                counter.merge(num, 1, Integer::sum);
            } else {
                counter.put(num, 1);
            }
        }

        return counter.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
