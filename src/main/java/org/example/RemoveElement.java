package org.example;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int last = nums.length - 1;
        int count = 0;

        for (int i=0; i<nums.length; i++) {
            // assign the last index
            while (nums[last] == val && last > 0) {
                last -= 1;
            }

            if (i < last && nums[i] == val) {
                // swap the values
                int temp = nums[i];
                nums[i] = nums[last];
                nums[last] = temp;
                // goes to the next index
                last -= 1;
            }
        }

        for (int i=nums.length - 1; i >= 0; i--) {
            if (nums[i] != val) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(removeElement(new int[] {1}, 1));
    }
}
