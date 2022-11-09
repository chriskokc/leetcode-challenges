package org.example;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        // hash map
        Map<Integer, Integer> numberCount = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            numberCount.put(nums[i], numberCount.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {2, 2, 1}));
        System.out.println(singleNumber(new int[] {4, 1, 2, 1, 2}));
        System.out.println(singleNumber(new int[] {1}));
    }
}
