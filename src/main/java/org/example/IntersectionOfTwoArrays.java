package org.example;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersectionArr = new ArrayList<>();
        Map<Integer, Integer> nums1Map = new HashMap<>();

        for (int number : nums1) {
            nums1Map.put(number, nums1Map.getOrDefault(number, 0) + 1 );
        }

        for (int number: nums2) {
            if (nums1Map.containsKey(number) && !intersectionArr.contains(number)) {
                intersectionArr.add(number);
            }
        }

        return intersectionArr.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[] {1, 2, 2, 1},  new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4})));
    }
}
