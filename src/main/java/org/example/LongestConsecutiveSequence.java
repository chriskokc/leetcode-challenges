package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        List<Integer> filteredArr =  new ArrayList<>();
        // create an array list which stores only distinct values
        filteredArr.add(nums[0]);
        for (int i=1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                filteredArr.add(nums[i]);
            }
        }

        if (filteredArr.size() == 1) {
            return 1;
        } else {
            List<Integer> countList = new ArrayList<>();
            int count = 1;
            for (int i=0; i <filteredArr.size() - 1; i++) {
                if (filteredArr.get(i+1) - filteredArr.get(i) == 1) {
                    count += 1;
                }

                if (i == filteredArr.size() - 2 || filteredArr.get(i+1) - filteredArr.get(i) != 1) {
                    countList.add(count);
                    count = 1;
                }
            }
            return Collections.max(countList);
        }
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {}));
        System.out.println(longestConsecutive(new int[] {0}));
        System.out.println(longestConsecutive(new int[] {0, 0}));
        System.out.println(longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(longestConsecutive(new int[] {1, 9, 3, 10, 4, 20, 2}));
        System.out.println(longestConsecutive(new int[] {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}));
        System.out.println(longestConsecutive(new int[] {1, 2, 0, 1}));
    }
}
