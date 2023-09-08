package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        var numbers = setFromArray(nums);
        var longestConsecutiveSequence = 0;

        for (int num : nums) {
            if (!numbers.contains(num - 1)) {
                int counter = 1;
                while (numbers.contains(num + counter)) {
                    counter++;
                }
                longestConsecutiveSequence = Math.max(counter, longestConsecutiveSequence);
            }
        }

        return longestConsecutiveSequence;
    }

    private Set<Integer> setFromArray(int[] nums) {
        var numbers = new HashSet<Integer>();
        for (int num : nums) {
            numbers.add(num);
        }
        return numbers;
    }
}
