package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>();

        for (int i=0; i < nums.length; i++) {
            numCounts.put(nums[i], numCounts.getOrDefault(nums[i], 0) + 1);
        }

        Integer[] expectedNums = numCounts.keySet().toArray(new Integer[0]);

        Arrays.sort(expectedNums);

        for (int i=0; i < expectedNums.length; i++) {
            nums[i] = expectedNums[i];
        }

        return expectedNums.length;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1, 1, 2}));
        System.out.println(removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[] {-3, -1, 0, 0, 0, 3, 3}));
    }

}
