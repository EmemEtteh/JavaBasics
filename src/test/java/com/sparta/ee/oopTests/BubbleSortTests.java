package com.sparta.ee.oopTests;

import com.sparta.ee.App;
import com.sparta.ee.oop.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {

    @Test
    @DisplayName("check that negative values still sort")
    void checkNegativeValuesSort() {
        int[] expectedArray = new int[] {-3, -2, -1, 2, 5};
        int[] testArray = new int[] {-2, -3, 5, 2,-1};

        Assertions.assertArrayEquals(expectedArray, BubbleSort.sortThisArray(testArray));
    }


    @Test
    @DisplayName("check that a sorted array is still sorted")
    void checkSortedArrayStaysSorted() {
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};
        int[] testArray = new int[] {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(expectedArray, BubbleSort.sortThisArray(testArray));
    }
}
