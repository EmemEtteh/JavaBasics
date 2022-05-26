package com.sparta.ee.oop;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sortThisArray(int[] list) {
        //int[] list = {12, 1, 342, 8, 28, 1, 79};

        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-1; j++) {
                if (list[j] > list[j+1]) {
                    int temp = 0;
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }

    public static void main( String[] args ) {

        //System.out.println(Arrays.toString(sortThisArray()));
    }
}
