package org.example;

import java.util.Arrays;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String formattedInputStr = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        char[] inputArr = formattedInputStr.toCharArray();
        char[] reversedInputArr = new char[inputArr.length];

        for (int i=reversedInputArr.length - 1; i >= 0; i--) {
            reversedInputArr[reversedInputArr.length - 1 - i] = inputArr[i];
        }

        return Arrays.equals(inputArr, reversedInputArr);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }
}
