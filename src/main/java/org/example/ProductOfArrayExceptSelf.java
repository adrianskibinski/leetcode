package org.example;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        var leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i - 1];
        }
        var rightProduct = new int[nums.length];
        rightProduct[nums.length-1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i+1] * nums[i + 1];
            leftProduct[i] = leftProduct[i] * rightProduct[i];
        }
        return leftProduct;
    }
}
