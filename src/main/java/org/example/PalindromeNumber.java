package org.example;

import java.util.Arrays;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        char[] forwardArr = input.toCharArray();
        char[] backwardArr = new char[forwardArr.length];

        for (int i = forwardArr.length - 1; i >= 0; i--) {
            backwardArr[forwardArr.length - 1 - i] = forwardArr[i];
        }

        return Arrays.equals(forwardArr, backwardArr);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

}
