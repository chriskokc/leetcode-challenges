package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] sArr = s.toCharArray();
        int result = 0;
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        if (romanNumerals.containsKey(s)) {
            return romanNumerals.get(s);
        }

        for (int i=0; i < sArr.length-1; i++) {
            if (romanNumerals.get(sArr[i]) < romanNumerals.get(sArr[i+1])) {
                result -= romanNumerals.get(sArr[i]);
            } else {
                result += romanNumerals.get(sArr[i]);
            }
        }

        result += romanNumerals.get(sArr[sArr.length-1]);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("XL"));
        System.out.println(romanToInt("MCMIV"));
    }
}
