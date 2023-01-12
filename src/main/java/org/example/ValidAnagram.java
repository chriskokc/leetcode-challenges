package org.example;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        String modifiedFirstInput = s.toLowerCase().replaceAll("[^a-z]", "");
        String modifiedSecondInput = t.toLowerCase().replaceAll("[^a-z]", "");
        char[] modifiedFirstInputArr = modifiedFirstInput.toCharArray();
        char[] modifiedSecondInputArr = modifiedSecondInput.toCharArray();
        Arrays.sort(modifiedFirstInputArr);
        Arrays.sort(modifiedSecondInputArr);

        if (String.valueOf(modifiedFirstInputArr).equals(String.valueOf(modifiedSecondInputArr))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("a gentleman", "elegant man"));
        System.out.println(isAnagram("Clint Eastwood", "old west action"));
        System.out.println(isAnagram("William Shakespeare", "I'll make a wise phrase"));
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
