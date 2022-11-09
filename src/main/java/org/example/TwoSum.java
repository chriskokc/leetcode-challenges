package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
//        naive approach
//        int[] result = new int[]{};
//        for (int i=0; i < nums.length; i++) {
//            for (int j=i+1; j< nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                   result = new int[]{i, j};
//                }
//            }
//        }
//        return result;

//        hash map map = {2=0, 7=1, 11=2, 15=3}
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i=0; i < nums.length; i ++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] {3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] {3, 3}, 6)));
    }
}
