package com.sparta.ee.oopTests;

import com.sparta.ee.App;
import com.sparta.ee.oop.FibonacciSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    @Test
    @DisplayName("check that 0 returns 0")
    void checkZeroReturnsZero() {
        Assertions.assertEquals(0, FibonacciSequence.getPosition(0));
    }

    @Test
    @DisplayName("check that 1 returns 1")
    void checkOneReturnsOne() {
        Assertions.assertEquals(1, FibonacciSequence.getPosition(1));
    }



    @Test
    @DisplayName("check that 20 returns 6765")
    void check20Returns6765() {
        Assertions.assertEquals(6765, FibonacciSequence.getPosition(20));
    }

    @Test
    @DisplayName("check that anything that isn't above 0 returns -1")
    void checkAnythingLessThanZeroReturnsMinusOne() {
        Assertions.assertEquals(-1, FibonacciSequence.getPosition(-1271));
    }

    @Test
    @DisplayName("check that choosing 8 returns 0,1,1,2,3,5,8,13")
    void checkThat8ReturnsZeroto13() {
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(0);
        expectedOutput.add(1);
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add(3);
        expectedOutput.add(5);
        expectedOutput.add(8);
        expectedOutput.add(13);
        Assertions.assertEquals(expectedOutput, FibonacciSequence.fibonacciIterator(8));
    }




//    @Test
//    @DisplayName("check that choosing 8 returns 0,1,1,2,3,5,8,13")
//    void checkThat8ReturnsZeroto13RecursiveOne() {
//        ArrayList<Integer> expectedOutput = new ArrayList<>();
//        expectedOutput.add(0);
//        expectedOutput.add(1);
//        expectedOutput.add(1);
//        expectedOutput.add(2);
//        expectedOutput.add(3);
//        expectedOutput.add(5);
//        expectedOutput.add(8);
//        expectedOutput.add(13);
//        Assertions.assertEquals(expectedOutput, FibonacciSequence.makeFibonacci(8));
//    }

}