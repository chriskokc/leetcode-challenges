package org.example;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeros(int[] nums) {
        int count = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count += 1;
            }
        }
        for (int i=count; i < nums.length; i++) {
            nums[count] = 0;
            count += 1;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeros(new int[] {0, 1, 0, 3, 12});
        moveZeros(new int[] {0});
    }
}
