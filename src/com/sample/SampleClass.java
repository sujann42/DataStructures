package com.sample;

public class SampleClass {

    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 3, 6, 4};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {7, 6, 4, 3, 1};
        buyNSellStock(nums1);
        buyNSellStock(nums2);
        buyNSellStock(nums3);
    }

    private static void buyNSellStock(int[] nums) {
        printArray(nums);

        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}
