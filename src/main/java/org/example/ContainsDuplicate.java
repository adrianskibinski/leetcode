package org.example;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        var numbers = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!numbers.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
