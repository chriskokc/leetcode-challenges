package org.example;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1) ;
        }
        for (Integer num : countMap.keySet()) {
            if (countMap.get(num) > nums.length / 2) {
                return num;
            }
        }
        // when there is no majority element
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3, 2, 3}));
        System.out.println(majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
        System.out.println(majorityElement(new int[] {3, 3, 4, 2, 4, 4, 2, 4, 4}));
        System.out.println(majorityElement(new int[] {3, 3, 4, 2, 4, 4, 2, 4}));
    }
}
