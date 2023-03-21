package org.example;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int numberOfDistinctNums = nums.length;

        Arrays.sort(nums);

        if (numberOfDistinctNums == 0) {
            return 0;
        }

        // the first number must be 0 after the array is sorted
        if (nums[0] != 0) {
            return 0;
        }

        for (int i=0; i < numberOfDistinctNums - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];
            if (next - current == 2) {
                return current + 1;
            }

        }
        // if no missing number is found after looping through the entire array except the last number,
        // return the total number of distinct numbers in the array
        return numberOfDistinctNums;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {3, 0, 1}));
        System.out.println(missingNumber(new int[] {0, 1}));
        System.out.println(missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber(new int[] {}));
        System.out.println(missingNumber(new int[] {1}));
        System.out.println(missingNumber(new int[] {0}));
    }

}
