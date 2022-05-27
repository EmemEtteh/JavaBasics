package com.sparta.ee.oopTests;

import com.sparta.ee.App;
import com.sparta.ee.oop.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PalindromeTests {

    @Test
    @DisplayName("check aqa returns true ")
    void checkAqaReturnsTrue() {
        Assertions.assertEquals(true, Palindrome.isPalindromeChecker("aqa"));
    }

    @Test
    @DisplayName("check aqb returns false ")
    void checkAqbReturnsFalse() {
        Assertions.assertEquals(false, Palindrome.isPalindromeChecker("aqb"));
    }

    @Test
    @DisplayName("check that palindrome returns false if the length is less than 3 ")
    void checkPalindromeReturnsFalseIfLengthLessThan3() {
        Assertions.assertEquals(false, Palindrome.isPalindromeChecker("oo"));
    }

    @Test
    @DisplayName("check that the longest multiple palindrome(s) are returned")
    void checkPalindromesIsLongestInSentence() {
        //Assertions.assertEquals(true, Palindrome.isPalindromeChecker("pullup"));
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("racecar");
        Assertions.assertEquals(expectedOutput, Palindrome.findLongestPalindrome("The aqa and racecar"));
    }

    @Test
    @DisplayName("check that the multiple palindronmes of the same length can be returned")
    void checkMultiplePalindromesOfSameLengthAreReturned() {
        //Assertions.assertEquals(true, Palindrome.isPalindromeChecker("pullup"));
        ArrayList<String> expectedOutput2 = new ArrayList<>();
        expectedOutput2.add("badadab");
        expectedOutput2.add("repaper");
        expectedOutput2.add("racecar");


        Assertions.assertEquals(expectedOutput2, Palindrome.findLongestPalindrome("The badadab, the repaper and racecar"));
        //Assertions.assertSame(expectedOutput2,Palindrome.findLongestPalindrome("The badadab, the repaper and racecar"));
    }

    @Test
    @DisplayName("check that the palindromes under 6 letters aren't returned")
    void checkPalindromesUnderSixLettersAreNotReturned() {
        //Assertions.assertEquals(true, Palindrome.isPalindromeChecker("pullup"));
        ArrayList<String> expectedOutput = new ArrayList<>();

        Assertions.assertEquals(expectedOutput, Palindrome.findLongestPalindrome("The aqa and dad"));
    }

        //ArrayList<String> expectedOutput = new ArrayList<String>();
        //expectedOutput.add("racecar");
        //ArrayList<String> the_aqa_and_racecar = Palindrome.findLongestPalindrome("The aqa and racecar");
       // Assertions.assertArrayEquals(expectedOutput, the_aqa_and_racecar);

}
