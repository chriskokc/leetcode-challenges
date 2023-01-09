package org.example;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num: nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }
        for (int count : numCount.values()) {
            if (count >= 2 ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
