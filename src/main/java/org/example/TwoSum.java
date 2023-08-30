package org.example;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var numbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            var value = numbers.get(key);
            if (value != null) {
                return new int[]{value, i};
            }
            numbers.put(nums[i], i);
        }
        return null;
    }
}
