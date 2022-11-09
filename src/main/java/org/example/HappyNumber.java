package org.example;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    public static int sumOfDigitSquare(int n) {
        String inputNumber = String.valueOf(n);
        String[] inputDigit = inputNumber.split("");
        int sumOfDigits = 0;

        for (String digit : inputDigit) {
            sumOfDigits += Math.pow(Double.parseDouble(digit), 2.0);
        }

        return sumOfDigits;
    }

    public static boolean isHappy(int n) {
        Map<Integer, Integer> numCount = new HashMap<>();

        while (true) {
            n = sumOfDigitSquare(n);
            numCount.put(n, numCount.getOrDefault(n, 0) + 1);

            if (n == 1) {
                return true;
            }

            if (numCount.get(n) > 1) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
