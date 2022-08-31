package com.cs61b.Testing;

public class Sort {
    public static void sort(int[] nums) {
        sort(nums, 0);
    }

    public static void sort(int[] nums, int start) {

        if (start == nums.length) return;
        int smallestIndex = findSmallestIndex(nums, start);
        swap(nums, start, smallestIndex);
        sort(nums, start + 1);

    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static int findSmallestIndex(int[] nums, int start) {
        int smallestIndex = 0;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] < nums[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
