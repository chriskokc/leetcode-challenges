package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        int[][] arr = new int[numRows][numRows];

        for (int row=0; row < numRows; row++) {
            List<Integer> eachList = new ArrayList<>();
            for (int column=0; column <= row; column++) {
                if (column == 0 || row == column) {
                    arr[row][column] = 1;
                    eachList.add(arr[row][column]);
                } else {
                    arr[row][column] = arr[row - 1][column - 1] + arr[row - 1][column];
                    eachList.add(arr[row][column]);
                }
            }
            resultList.add(eachList);
        }

        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(1));
    }
}
