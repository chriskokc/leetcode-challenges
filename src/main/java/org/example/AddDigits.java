package org.example;

public class AddDigits {
    public static int addDigits(int num) {
        String numToStr = String.valueOf(num);

        if (numToStr.length() == 1) {
            return num;
        }

        String[] numStrArr = numToStr.split("");
        int result = 0;
        for (String number : numStrArr) {
            result += Integer.parseInt(number);
        }
        return addDigits(result);
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
    }
}
